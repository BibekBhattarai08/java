
//WAP to add positive and negative number add by use  and end program when user enterv end
import java.util.Scanner;

public class checkinginp2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while (num >= 0) {
            sum = sum + num;
            System.out.println("Entet a number");
            num = input.nextInt();

        }
        System.out.println("sum is =" + sum);
        input.close();
    }

}
