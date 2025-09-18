package Object_Modeling.Assisted_Problems;
import java.util.*;

class Bank {
    private String name;
    private List<Customer> customers;
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }
    public void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println("Account opened for " + customer.getName() + " at " + name + ".");
    }
    public List<Customer> getCustomers() {
        return customers;
    }
}
class Customer {
    private String name;
    private double balance;
    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void viewBalance() {
        System.out.println(name + "'s current balance is: $" + String.format("%.2f", balance));
    }
}
 class Bank_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bank name: ");
        String bankName = sc.nextLine();
        Bank myBank = new Bank(bankName);
        System.out.print("Enter number of new customers: ");
        int numCustomers = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numCustomers; i++) {
            System.out.print("Enter customer " + (i + 1) + " name: ");
            String customerName = sc.nextLine();
            System.out.print("Enter initial balance: ");
            double initialBalance = sc.nextDouble();
            sc.nextLine();
            Customer newCustomer = new Customer(customerName, initialBalance);
            myBank.openAccount(newCustomer);
        }
        System.out.println("\n--- All Accounts in " + myBank.getCustomers().get(0).getName() + " ---");
        for (Customer c : myBank.getCustomers()) {
            c.viewBalance();
        }
        sc.close();
    }
}