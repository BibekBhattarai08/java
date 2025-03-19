package rebankingapp;

import java.util.Scanner;

public class bankingapp {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your full name");
        String name = inp.nextLine();
        System.out.println("Enter your balance");
        double balance = inp.nextDouble();

        account account1 = new account(name, balance);
    
        account1.deposit(200);
        account1.withdraw(100);
        System.out.println("After Transection, the balance is " + account1.getBalance());

        inp.close();

    }

}
