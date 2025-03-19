import java.util.Scanner;

public class checkingInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a numbeer: ");
        int num = input.nextInt();
        while (num < 0) {

            System.out.println("negative number is not allowed try again:");
            num = input.nextInt();

        }
        System.out.println("you have entered " + num);
        input.close();
    }

}
