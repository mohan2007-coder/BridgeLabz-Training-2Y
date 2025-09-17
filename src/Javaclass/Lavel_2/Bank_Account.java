package Javaclass.Lavel_2;

import java.util.Scanner;
public class Bank_Account {
    private String accountHolder;
    private int accountNumber;
    private double balance;
    public Bank_Account(String accountHolder, int accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0)
        {
            balance += amount;
            System.out.printf("Deposited: $%.2f%n", amount);
        }
        else
        {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0)
        {
            if (balance >= amount)
            {
                balance -= amount;
                System.out.printf("Withdrew: $%.2f%n", amount);
            }
            else
            {
                System.out.println("Insufficient balance.");
            }
        }
        else
        {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    public void displayBalance() {
        System.out.printf("Current Balance: $%.2f%n", balance);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank_Account account = new Bank_Account("John Doe", 123456789, 1000.00);
        System.out.println("Welcome to the ATM!");
        account.displayBalance();
        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
