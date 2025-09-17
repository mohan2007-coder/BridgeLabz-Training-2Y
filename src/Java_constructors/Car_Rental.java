package Java_constructors;

import java.util.Scanner;
public class Car_Rental {
    String customerName;
    String carModel;
    int rentalDays;
    double rentalCostPerDay;
    double totalCost;
    public Car_Rental(String customerName, String carModel, double rentalCostPerDay, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalCostPerDay = rentalCostPerDay;
        this.rentalDays = rentalDays;
        this.totalCost = calculate_TotalCost();
    }
    public double calculate_TotalCost() {
        return rentalDays * rentalCostPerDay;
    }
    public void display_Rental_Details() {
        System.out.println("\n--- Rental Summary ---");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.printf("Total Cost: $%.2f%n", totalCost);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Car Rental System!");
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        System.out.print("Enter rental days: ");
        int days = scanner.nextInt();
        System.out.print("Enter rental cost per day: ");
        double costPerDay = scanner.nextDouble();
        Car_Rental rental = new Car_Rental(name, model, costPerDay, days);
        rental.display_Rental_Details();
        scanner.close();
    }
}