import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the account holder name: ");
        String name = inp.nextLine();

        System.out.println("Enter the account Balance: ");
        double Balance = inp.nextDouble();

        Account account1 = new Account();
        account1.setName(name);
        account1.setBalance(Balance);
        System.out.println("the account for customer" + account1.getName() + " has $ " + account1.getBalance());

        account1.deposit(100);
        account1.withdraw(30);
        System.out.println("After Transection, the balance is " + account1.getBalance());

        inp.close();
    }

}
