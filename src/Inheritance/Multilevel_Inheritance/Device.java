package Inheritance.Multilevel_Inheritance;
import java.util.Scanner;
class Order {
    String order_Id;
    String order_Date;
    Order(String order_Id, String order_Date) {
        this.order_Id = order_Id;
        this.order_Date = order_Date;
    }
    String get_Order_Status() {
        return "Order placed on " + order_Date;
    }
}
class Shipped_Order extends Order {
    String tracking_Number;
    Shipped_Order(String order_Id, String order_Date, String tracking_Number) {
        super(order_Id, order_Date);
        this.tracking_Number = tracking_Number;
    }
    String get_Order_Status() {
        return "Order shipped with Tracking Number: " + tracking_Number;
    }
}
class Delivered_Order extends Shipped_Order {
    String delivery_Date;
    Delivered_Order(String order_Id, String order_Date, String tracking_Number, String delivery_Date) {
        super(order_Id, order_Date, tracking_Number);
        this.delivery_Date = delivery_Date;
    }
    String get_Order_Status() {
        return "Order delivered on " + delivery_Date;
    }
}
class Online_Retail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order ID: ");
        String order_Id = sc.nextLine();
        System.out.print("Enter order date: ");
        String order_Date = sc.nextLine();
        System.out.print("Enter tracking number: ");
        String tracking_Number = sc.nextLine();
        System.out.print("Enter delivery date: ");
        String delivery_Date = sc.nextLine();
        Delivered_Order order = new Delivered_Order(order_Id, order_Date, tracking_Number, delivery_Date);
        System.out.println("\nOrder Details:");
        System.out.println("Order ID: " + order.order_Id);
        System.out.println("Order Date: " + order.order_Date);
        System.out.println("Tracking Number: " + order.tracking_Number);
        System.out.println("Delivery Date: " + order.delivery_Date);
        System.out.println("Status: " + order.get_Order_Status());
        sc.close();
    }
}
