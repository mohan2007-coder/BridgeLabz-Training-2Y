package Object_Modeling.Self_Problems;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private Customer customer;
    private List<Product> products;

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrderDetails() {
        System.out.println("\nOrder for Customer: " + customer.getName());
        System.out.println("Products in Order:");
        if (products.isEmpty()) {
            System.out.println("No products in this order.");
            return;
        }
        double total = 0;
        for (Product p : products) {
            System.out.println("- " + p.getName() + " ($" + p.getPrice() + ")");
            total += p.getPrice();
        }
        System.out.println("Total Price: $" + String.format("%.2f", total));
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " has placed a new order.");
    }
}

 class Product_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        Customer customer = new Customer(scanner.nextLine());

        System.out.print("Enter number of products to create: ");
        int numProducts = scanner.nextInt();
        scanner.nextLine();

        List<Product> allProducts = new ArrayList<>();
        for (int i = 0; i < numProducts; i++) {
            System.out.print("Enter name for Product " + (i + 1) + ": ");
            String productName = scanner.nextLine();
            System.out.print("Enter price for " + productName + ": $");
            double productPrice = scanner.nextDouble();
            scanner.nextLine();
            allProducts.add(new Product(productName, productPrice));
        }

        Order order = new Order(customer);
        System.out.println("\nNew order created for " + customer.getName() + ".");

        while (true) {
            System.out.println("\n--- Add Products to Order ---");
            System.out.println("Available Products:");
            for (int i = 0; i < allProducts.size(); i++) {
                System.out.println((i + 1) + ". " + allProducts.get(i).getName() + " ($" + allProducts.get(i).getPrice() + ")");
            }
            System.out.println("0. Finish and Place Order");
            System.out.print("Select a product to add (by number): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                break;
            }

            if (choice > 0 && choice <= allProducts.size()) {
                order.addProduct(allProducts.get(choice - 1));
                System.out.println("Added " + allProducts.get(choice - 1).getName() + " to the order.");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        customer.placeOrder(order);
        order.displayOrderDetails();

        scanner.close();
    }
}