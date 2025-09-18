package Javaclass.Level_1;

import java.util.Scanner;
public class Item {private String itemCode;
    private String itemName;
    private double price;
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.printf("Price: $%.2f%n", price);
    }
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter item code: ");
        String code = scanner.nextLine();
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();
        System.out.print("Enter item price: ");
        double itemPrice = scanner.nextDouble();
        Item newItem = new Item(code, name, itemPrice);
        System.out.println("\n--- Item Details ---");
        newItem.displayItemDetails();
        System.out.print("\nEnter the quantity: ");
        int quantity = scanner.nextInt();
        double totalCost = newItem.calculateTotalCost(quantity);
        System.out.printf("Total cost for %d units: $%.2f%n", quantity, totalCost);
        scanner.close();
    }
}