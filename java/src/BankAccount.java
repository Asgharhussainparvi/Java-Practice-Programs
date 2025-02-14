import java.util.Scanner;

public class BankAccount {
    // Attributes (member variables)
    private int accountNumber;
    private double balance;

    Scanner sc = new Scanner(System.in);
    public void setDtails(){
        System.out.println("Enter your Acc no here :");
        this.accountNumber  = sc.nextInt();
        this.balance = 1000000;


    }


    public void getDetails(){
        System.out.println("Account No is :"+ this.accountNumber);
        System.out.println("Balance is :"+this.balance);
    }

    // Methods (member functions)
    public void deposit() {
        System.out.println("Enter deposit Amount here :");
        int amount = sc.nextInt();
        balance += amount;
    }

    public void withdraw() {
        System.out.println("Enter Withdraw Amount here :");
        int amount = sc.nextInt();
        balance += amount;
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("The Balance is insufficient");
            withdraw();
            // Handle insufficient balance scenario
        }
        sc.close();
    }

    public void getBalance() {
        System.out.println("The balance now is "+this.balance);
    }



    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.setDtails();
        acc1.getDetails();
        acc1.deposit();
        acc1.getBalance();
        acc1.withdraw();
        acc1.getBalance();

    }
}

