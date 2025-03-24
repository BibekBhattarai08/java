
/*
 use loop to store 50 rndom number in array'rndarry
 prompt user to enter a number"num""
 check if 'num' matched with element of rndarry
 if mathed print its place in array[0-49]
 else print not found
 */
import java.util.Random;
import java.util.Scanner;

public class searchInteger {
    public static void main(String[] args) {

        int[] rndarry = new int[50];

        Random rnd = new Random();
        for (int i = 0; i < rndarry.length; i++) {
            rndarry[i] = rnd.nextInt(100) + 1;
        }
        System.out.println("Generated numbers:");
        for (int i = 0; i < rndarry.length; i++) {
            System.out.println("Index " + i + ": " + rndarry[i]);
        }

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = inp.nextInt();

        boolean found = true;
        for (int i = 0; i < rndarry.length; i++) {
            if (rndarry[i] == num) {
                System.out.println("number found on array index " + i);
                found = true;
            }

        }
        if (!found) {
            System.out.println("not found");
        }
    }

}
