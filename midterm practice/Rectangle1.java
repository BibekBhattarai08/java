import java.util.Scanner;

public class Rectangle1 {
    public int length;
    public int width;

    public int calculateArea() {
        int area = length * width;
        return area;
    }

    public static void main(String[] args) {

        Rectangle1 one = new Rectangle1();
        Rectangle1 two = new Rectangle1();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Length and width of first rectangle:");
        one.length = input.nextInt();
        one.width = input.nextInt();
        System.out.println("Enter Length and width of 2nd rectangle:");
        two.length = input.nextInt();
        two.width = input.nextInt();

        int area1 = one.calculateArea();
        int area2 = two.calculateArea();
        System.out.println("Area one is : " + area1);
        System.out.println("Area two is : " + area2);
        input.close();

    }

}
