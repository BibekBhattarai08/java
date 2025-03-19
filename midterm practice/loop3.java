public class loop3 {

    public static void main(String[] args) {
        loop3 self = new loop3();
        self.printRectangle(4, 5, 'o');
        self.printRectangle(4, 5, '+');
        self.printRectangle(4, 5, '-');
    }

    public void printRectangle(int length, int width, char ch) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(ch);

            }
            System.out.println();

        }
        System.out.println();

    }

}
