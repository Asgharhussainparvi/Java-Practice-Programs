package ATM_Machine;
import java.util.Scanner;


public class ATM {


        int balance = 10000; // Initial balance
        int accountNumber = 123456; // Sample account number
        int pin = 1234; // Sample pin
        Scanner scanner = new Scanner(System.in);


        public void run() {
            int choice;

            while (true) {
                System.out.println("Welcome to ATM");
                System.out.println("1. Login");
                System.out.println("2. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                if (choice == 1) {
                    if (authenticate()) {
                        atmMenu();
                    } else {
                        System.out.println("Invalid account number or PIN. Please try again.");
                    }
                } else if (choice == 2) {
                    System.out.println("Thank you for using ATM. Have a nice day!");
                    break;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            }

        }

        public boolean authenticate() {
            System.out.print("Enter account number: ");
            int enteredAccountNumber = scanner.nextInt();
            System.out.print("Enter PIN: ");
            int enteredPin = scanner.nextInt();

            return enteredAccountNumber == accountNumber && enteredPin == pin;
        }

        public void atmMenu() {

            int choice;

            while (true) {
                System.out.println("ATM Menu");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Cash");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println("Your current balance is: $" + balance);
                } else if (choice == 2) {
                    withdrawCash();
                } else if (choice == 3) {
                    System.out.println("Exiting ATM...");
                    break;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            }

        }

        public void withdrawCash() {
            int amount;

            System.out.print("Enter amount to withdraw: ");
            amount = scanner.nextInt();

            // Basic validation to prevent overdraft
            if (amount > balance) {
                System.out.println("Insufficient funds. Please enter a lower amount.");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. Please collect your cash: $" + amount);
                System.out.println("Remaining balance: $" + balance);
            }



        }
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.run();
    }

    }


