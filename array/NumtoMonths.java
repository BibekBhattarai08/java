import java.util.Scanner;

public class NumToMonths {  // Class name follows PascalCase

    public String numToMonth(int num) {  // Method follows camelCase
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        if (num >= 1 && num <= 12) {
            return months[num - 1];
        } else {
            return "Invalid input. Please enter a number between 1 and 12.";
        }
    }

    public static void main(String[] args) {
        NumToMonths converter = new NumToMonths();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-12) to get the corresponding month: ");

        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            System.out.println(converter.numToMonth(num));
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
        }

        scanner.close();
    }
}
