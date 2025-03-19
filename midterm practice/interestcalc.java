public class interestcalc {

    public static void main(String[] args) {
        int numberOfYears = 7;
        double annualInterestRate = 0;
        switch (numberOfYears) {
            case 7:
                annualInterestRate = 7.25;
                System.out.println(annualInterestRate);
                break;

            case 15:
                annualInterestRate = 8.50;
                break;
            case 30:
                annualInterestRate = 9.0;
                break;

            default:
                System.out.println("wrong # of years");
                annualInterestRate = -1.0;

        }

    }
}
