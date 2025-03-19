public class looprectangle {
    public static void main(String[] args) {
        int weidth = 20;
        int height = 7;
        char ch = 'o';
        // we usse for loop because we know what numbe rto use
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weidth; j++) {
                System.out.print(ch);

            }
            System.out.println();
        }
    }
}
