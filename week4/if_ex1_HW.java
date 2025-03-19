import java.util.Scanner;

public class if_ex1_HW {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner name = new Scanner(System.in);
        String Name = name.nextLine();
        System.out.println("How may time u want to print your name: ");
        Scanner order = new Scanner(System.in);

        int Order = order.nextInt();
        if (Order < 1) {
            System.out.println("It can't be in negative or zero. Please enter a valid number.");
        }
        System.out.println("Your Nmame is" + " " + Name + "  " + " You Chose " + Order);

        if (Order < 1) {
            System.out.println("it cant be in negative");
        } else {
            for (int i = 0; i < Order; i++) {
                System.out.println(Name);
            }
        }

    }
}
