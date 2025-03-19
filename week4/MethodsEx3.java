import java.util.Scanner;

public class MethodsEx3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter length and width  of 1st rectangle : ");
        r1.length = inp.nextDouble();
        r1.width = inp.nextDouble();

        System.out.println("Enter length and width  of 2nd rectangle : ");
        r2.length = inp.nextDouble();
        r2.width = inp.nextDouble();

        // Scanner.width= new Scanner(System.in);
        double area1 = r1.calculateArea();
        double area2 = r2.calculateArea();

        System.out.println("the area of rectangle 1 is " + area1 + "rectangle 2 is " + area2);
        inp.close();
    }
}
