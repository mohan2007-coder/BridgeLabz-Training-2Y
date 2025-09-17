package Javaclass.Lavel_2;

import java.util.Scanner;
public class Cart_Item {
    private String itemName;
    private double price;
    private int quantity;
    public Cart_Item(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public void add_Quantity(int additionalQuantity) {
        if (additionalQuantity > 0)
        {
            this.quantity += additionalQuantity;
            System.out.println(additionalQuantity + " " + this.itemName + "(s) added to the cart.");
        }
        else
        {
            System.out.println("Invalid quantity to add.");
        }
    }
    public void remove_Quantity(int removalQuantity) {
        if (removalQuantity > 0 && this.quantity >= removalQuantity)
        {
            this.quantity -= removalQuantity;
            System.out.println(removalQuantity + " " + this.itemName + "(s) removed from the cart.");
        }
        else
        {
            System.out.println("Invalid quantity to remove or insufficient items in cart.");
        }
    }
    public double calculateTotalCost() {
        return this.price * this.quantity;
    }
    public void displayItemDetails() {
        System.out.println("Item: " + this.itemName);
        System.out.printf("Price per item: $%.2f%n", this.price);
        System.out.println("Quantity: " + this.quantity);
        System.out.printf("Subtotal: $%.2f%n", calculateTotalCost());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter item details to add to cart:");
        System.out.print("Item name: ");
        String name = scanner.nextLine();
        System.out.print("Price: ");
        double itemPrice = scanner.nextDouble();
        System.out.print("Initial quantity: ");
        int initialQuantity = scanner.nextInt();
        Cart_Item item = new Cart_Item(name, itemPrice, initialQuantity);
        System.out.println("\nItem successfully added to cart.");
        item.displayItemDetails();
        System.out.println("\nWould you like to add more of this item? (enter quantity, 0 to skip)");
        int addMore = scanner.nextInt();
        item.add_Quantity(addMore);
        System.out.println("\nWould you like to remove some of this item? (enter quantity, 0 to skip)");
        int remove = scanner.nextInt();
        item.remove_Quantity(remove);
        System.out.println("\n--- Final Cart Item Details ---");
        item.displayItemDetails();
        scanner.close();
    }
}
