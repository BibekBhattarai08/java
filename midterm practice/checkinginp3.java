
//WAP to add positive and negative number add by use  and end program when user enterv end
import java.util.Scanner;

public class checkinginp3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userinput = "";
        int sum = 0;

        while (!userinput.equalsIgnoreCase("end")) {
            System.out.println("Enter any number to add (end to quite loop:) ");
            userinput = input.nextLine();
            if (!userinput.equalsIgnoreCase("end")) {
                int num = Integer.parseInt(userinput);
                sum = sum + num;
            }

        }
        System.out.println("sum is =" + sum);
        input.close();
    }

}
