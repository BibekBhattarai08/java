import java.util.Scanner;

public class mis {
    public static void main(String[] args) {
        System.out.println("Enter radius of a circle: ");
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        double area = radius * radius * Math.PI;
        System.out.println("area of circle is :" + area);
        input.close();

    }

}