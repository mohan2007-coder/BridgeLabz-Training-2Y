package Functional_interface;

interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Credit Card.");
    }
}

class Wallet implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Wallet.");
    }
}

public class Payment1{
    public static void main(String[] args) {
        Payment upi = new UPI();
        Payment card = new CreditCard();
        Payment wallet = new Wallet();

        upi.pay(500);
        card.pay(1000);
        wallet.pay(300);
    }
}
