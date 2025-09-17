package Javaclass.Level_1;

import java.util.Scanner;
public class Mobile_phone {private String brand;
    private String model;
    private double price;
    public Mobile_phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.printf("Price: $%.2f%n", price);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mobile phone details:");
        System.out.print("Brand: ");
        String phoneBrand = scanner.nextLine();
        System.out.print("Model: ");
        String phoneModel = scanner.nextLine();
        System.out.print("Price: ");
        double phonePrice = scanner.nextDouble();
        Mobile_phone myPhone = new Mobile_phone(phoneBrand, phoneModel, phonePrice);
        System.out.println("\n--- Mobile Phone Details ---");
        myPhone.displayDetails();
        scanner.close();
    }
}
