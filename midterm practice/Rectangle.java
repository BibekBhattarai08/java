public class Rectangle {
    public static int height = 5;
    public static int width = 6;

    public static void main(String[] args) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}