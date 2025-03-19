import java.util.Scanner;

public class ifex2 {

    public static void main(String[] args) {
        // String name = "Bkbek";
        String search = "bibek";
        System.out.println("Enter name:");
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        while (true) {

            if (!name.equals(search)) {
                System.out.println("Different string try again");
                name = inp.nextLine();
            } else {
                System.out.println("same name matched!!");
                break;
            }
            inp.close();
        }

    }
}