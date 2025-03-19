import java.util.Scanner;
public class interactivity {

    public static void main(String[] args) {
        // Prompt the user for input
        System.out.println("Please enter the radius of the circle: ");
        // Read the input using a Scanner object
        Scanner inputu = new Scanner(System.in);
        int radius = inputu.nextInt();
        // Use the input value to calculate area of the circle
        double circleArea = 3.1415927 * radius * radius;
        // Display the result
        System.out.println("The area is " + circleArea);
        
    }
}