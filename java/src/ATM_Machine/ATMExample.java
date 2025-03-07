package ATM_Machine;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ATMExample {
    public static void main(String[] args) {
        int balance = 100000; // Initial account balance
        int withdraw, deposit;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdrawn: ");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Please collect your money.");
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter money to be deposited: ");
                    deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Your money has been successfully deposited.");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Balance: " + balance);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Thanks for Choosing our Bank");
                    System.exit(0);
            }
        }
    }
}

