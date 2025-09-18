package Inheritance.Hierarchical_Inheritance;
import java.util.Scanner;
class Bank_Account {
    String account_Number;
    double balance;
    Bank_Account(String account_Number, double balance) {
        this.account_Number = account_Number;
        this.balance = balance;
    }
    void display_Details() {
        System.out.println("Account Number: " + account_Number);
        System.out.println("Balance: " + balance);
    }
}
class Savings_Account extends Bank_Account {
    double interest_Rate;
    Savings_Account(String account_Number, double balance, double interest_Rate) {
        super(account_Number, balance);
        this.interest_Rate = interest_Rate;
    }
    void display_Account_Type() {
        System.out.println("This is a Savings Account");
        display_Details();
        System.out.println("Interest Rate: " + interest_Rate + "%");
    }
}

class Checking_Account extends Bank_Account {
    double withdrawal_Limit;
    Checking_Account(String account_Number, double balance, double withdrawal_Limit) {
        super(account_Number, balance);
        this.withdrawal_Limit = withdrawal_Limit;
    }
    void display_Account_Type() {
        System.out.println("This is a Checking Account");
        display_Details();
        System.out.println("Withdrawal Limit: " + withdrawal_Limit);
    }
}

class Fixed_Deposit_Account extends Bank_Account {
    int deposit_Term;
    Fixed_Deposit_Account(String account_Number, double balance, int deposit_Term) {
        super(account_Number, balance);
        this.deposit_Term = deposit_Term;
    }

    void display_Account_Type() {
        System.out.println("This is a Fixed Deposit Account");
        display_Details();
        System.out.println("Deposit Term: " + deposit_Term + " months");
    }
}
class Bank_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Account Type: 1. Savings 2. Checking 3. Fixed Deposit");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Number: ");
        String accNum = sc.nextLine();
        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();
        switch (choice) {
            case 1:
                System.out.print("Enter Interest Rate: ");
                double rate = sc.nextDouble();
                Savings_Account sa = new Savings_Account(accNum, balance, rate);
                sa.display_Account_Type();
                break;
            case 2:
                System.out.print("Enter Withdrawal Limit: ");
                double limit = sc.nextDouble();
                Checking_Account ca = new Checking_Account(accNum, balance, limit);
                ca.display_Account_Type();
                break;
            case 3:
                System.out.print("Enter Deposit Term (in months): ");
                int term = sc.nextInt();
                Fixed_Deposit_Account fda = new Fixed_Deposit_Account(accNum, balance, term);
                fda.display_Account_Type();
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}
