package Java_constructors;

import java.util.Scanner;
public class Circle {
    private double radius;
    public Circle() {
        this(1.0);
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public void displayDetails() {
        System.out.println("Circle with radius: " + radius);
        System.out.printf("Area: %.2f%n", getArea());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creating a circle with default radius.");
        Circle circle1 = new Circle();
        circle1.displayDetails();
        System.out.println("\n----------------------------------------\n");
        System.out.println("Enter a custom radius for the second circle:");
        double customRadius = scanner.nextDouble();
        Circle circle2 = new Circle(customRadius);
        circle2.displayDetails();
        scanner.close();
    }
}