package Class_Object_Sequenece_Diagram;
import java.util.*;

class Product {
    private String name;
    private double price;
    private double quantity;

    public Product(String name, double price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return name + " (" + quantity + " units) - $" + String.format("%.2f", price);
    }
}

class Customer {
    private String name;
    private List<Product> products;

    public Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }
}

class BillGenerator {
    public double generateBill(Customer customer) {
        double total = 0;
        for (Product product : customer.getProducts()) {
            total += product.getTotalPrice();
        }
        return total;
    }
}
 class Product_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();
        Customer customer = new Customer(customerName);
        System.out.print("Enter number of products: ");
        int numProducts = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numProducts; i++) {
            System.out.print("Enter product name " + (i + 1) + ": ");
            String productName = sc.nextLine();
            System.out.print("Enter price per unit: ");
            double price = sc.nextDouble();
            System.out.print("Enter quantity: ");
            double quantity = sc.nextDouble();
            sc.nextLine();
            customer.addProduct(new Product(productName, price, quantity));
        }
        BillGenerator billGenerator = new BillGenerator();
        double totalBill = billGenerator.generateBill(customer);
        System.out.println("\n--- Bill for " + customer.getName() + " ---");
        for (Product p : customer.getProducts()) {
            System.out.println(p);
        }
        System.out.println("---------------------------------");
        System.out.println("Total: $" + String.format("%.2f", totalBill));
        sc.close();
    }
}
