import java.util.Scanner;

public class ifEx1 {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner inp = new Scanner(System.in);
        double num = inp.nextDouble();
        double ans = Math.sqrt(num);
        System.out.println("The square root is" + ans);
        inp.close();

    }

}
