import java.util.Scanner;

public class loop {

    public static void main(String[] args) {
        System.out.println("Enter how many time you want your to print out");
        Scanner inp = new Scanner(System.in);
        int reps = inp.nextInt();
        for (int i = 0; i < reps; i++) {
            System.out.println("Bibek" + " " + i + 1);
        }
        inp.close();

    }

}
