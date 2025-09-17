package Java_constructors;

import java.util.Scanner;
public class Book {
    String title;
    String author;
    double price;
    public Book() {
        this.title = "Unknown";
        this.author = "Anonymous";
        this.price = 0.0;
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.printf("Price: $%.2f%n", price);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book details:");
        System.out.print("Title: ");
        String userTitle = scanner.nextLine();
        System.out.print("Author: ");
        String userAuthor = scanner.nextLine();
        System.out.print("Price: ");
        double userPrice = scanner.nextDouble();
        Book userBook = new Book(userTitle, userAuthor, userPrice);
        System.out.println("\nBook details provided:");
        userBook.displayDetails();
        scanner.close();
    }
}
