import java.util.Scanner;

public class Main {
    private static Scanner inp = new Scanner(System.in);
    private static int id;

    public void menu(Student st) {
        while (true) {// making menu ask for another choice after every(123)
            System.out.println("Main Menu");
            System.out.println("1: Student Info");
            System.out.println("2: increase credit score");
            System.out.println("3: Change probation Status");
            System.out.println("4: Exit");
            System.out.print("Please choose what you'd like to do: ");
            int choice = inp.nextInt();

            // display student info
            if (choice == 1) {
                System.out.println("Student: " + st.getStudentName());
                System.out.println("ID: " + st.getId());
                System.out.println("GPA: " + st.getGpa());
                System.out.println("Credits Earned: " + st.getcreditEarned());
                System.out.println("probatation Status: " + st.getProbation());
                // increase credit by specified amount
            } else if (choice == 2) {
                System.out.print("Enter number of credit to add: ");
                double amount = inp.nextDouble();
                st.addCredits(amount);
                // chanage probatation
            } else if (choice == 3) {
                st.changeProbation();
                System.out.println("probatation status changed to " + st.getProbation());
            } else if (choice == 4) {
                return;// when user enter 4 it exit menu loop and prompt use to enter another student
                       // id
                // display invalid options if user input anything except(1,2,3,4)
            } else {
                System.out.println("invalid options");

            }
        }

    }

    // creating two seperate obj variable for name and id
    public static void main(String[] args) {
        Student one = new Student("Bibek Bhattarai", 991234567);
        Student two = new Student("Peter Parker", 991234568);

        one.setGpa(3.7);// initializing objects as instructed on Assignment Sheet
        two.setGpa(1.8);

        one.setCreditsEarned(39);
        two.setCreditsEarned(39);

        two.setProbation(true);
        // prompting the user to enter right student id
        Main main = new Main();

        while (true) {
            System.out.println("Enter id number: ");
            id = inp.nextInt();

            if (one.getId() == id) {

                main.menu(one);

            } else if (two.getId() == id) {

                main.menu(two);

            }

            else {
                System.out.println("Error! invalid id , Enter id again:");
                id = inp.nextInt();
            }
        }

    }

}
