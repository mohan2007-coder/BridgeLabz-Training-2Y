package Java_constructors;

import java.util.Scanner;
public class Person {
    private String name;
    private int age;
    private String address;
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public Person(Person original) {
        this.name = original.name;
        this.age = original.age;
        this.address = original.address;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for the original person:");
        System.out.print("Name: ");
        String originalName = scanner.nextLine();
        System.out.print("Age: ");
        int originalAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Address: ");
        String originalAddress = scanner.nextLine();
        Person originalPerson = new Person(originalName, originalAge, originalAddress);
        System.out.println("\nOriginal Person Details:");
        originalPerson.displayDetails();
        Person copiedPerson = new Person(originalPerson);
        System.out.println("\nCopied Person Details (created using copy constructor):");
        copiedPerson.displayDetails();
        scanner.close();
    }
}