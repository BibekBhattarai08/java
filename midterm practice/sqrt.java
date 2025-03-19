import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        System.out.println("enter a number;");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        double sqrt = Math.sqrt(num);
        System.out.println("The square root of " + num + " is " + sqrt);
        System.out.println(9 / 7);
        input.close();

    }

}
