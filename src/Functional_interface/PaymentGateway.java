package Functional_interface;

interface PaymentProcessor {
    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Refunding ₹" + amount);
    }
}

class Paytm implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Paytm");
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        Paytm p = new Paytm();
        p.processPayment(500);
        p.refund(100);
    }
}