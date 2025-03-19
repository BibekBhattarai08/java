import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("How many time u want to print: ");
        int length = input.nextInt();
        for (int i = 0; i < length; i++) {
            System.out.println(name + (i + 1));
        }
        input.close();
    }
}
