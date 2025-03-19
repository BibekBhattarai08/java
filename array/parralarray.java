
//make user to enter number hiw amny array he want 
//store name or values of array
import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter number of student in class: ");
        int num = inp.nextInt();
        inp.nextLine();

        // array for name
        String[] std = new String[num];
        // array for grade
        double[] grade = new double[num];

        // array to enter nam eof std

        for (int i = 0; i < std.length; i++) {
            System.out.println("Enter name of student (" + (i + 1) + ") ");
            std[i] = inp.nextLine();

        }
        System.out.println("student name entered");
        // array to store grade of stdnt

        for (int i = 0; i < std.length; i++) {
            System.out.println("Enter grade  of (" + std[i] + ")  ");
            grade[i] = inp.nextInt();

        }
        System.out.println("student grade entered");

        for (int i = 0; i < std.length; i++) {
            System.out.println(std[i] + " grade is " + grade[i]);
        }

    }

}
