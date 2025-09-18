import java.util.ArrayList;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void showDetails() {
        System.out.println("Product: " + name + " | Price: $" + price);
    }
}

class Order {
    int id;
    String date;
    ArrayList<Product> products;

    Order(int id, String date) {
        this.id = id;
        this.date = date;
        products = new ArrayList<>();
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void showProducts() {
        System.out.println("Order #" + id + " Products:");
        for (Product p : products) {
            p.showDetails();
        }
    }
}

class Customer {
    String name;
    String email;
    ArrayList<Order> orders;

    Customer(String name, String email) {
        this.name = name;
        this.email = email;
        orders = new ArrayList<>();
    }

    void placeOrder(Order o) {
        orders.add(o);
        System.out.println(name + " placed Order #" + o.id);
    }

    void showOrders() {
        System.out.println("Orders for " + name + ":");
        for (Order o : orders) {
            System.out.println("- Order #" + o.id + " (" + o.date + ")");
            o.showProducts();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Ankit", "ankit@example.com");

        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mouse", 500);
        Product p3 = new Product("Keyboard", 1200);

        Order o1 = new Order(101, "2025-09-18");
        o1.addProduct(p1);
        o1.addProduct(p2);

        Order o2 = new Order(102, "2025-09-19");
        o2.addProduct(p3);

        c1.placeOrder(o1);
        c1.placeOrder(o2);

        c1.showOrders();
    }
}
