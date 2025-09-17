package Java_constructors;
import java.util.Scanner;
public class Book_2 {
    String title;
    String author;
    double price;
    boolean isAvailable;
    public Book_2(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }
    public void borrow_Book() {
        if (isAvailable)
        {
            isAvailable = false;
            System.out.println("You have successfully borrowed '" + this.title + "'.");
        }
        else
        {
            System.out.println("Sorry, '" + this.title + "' is currently unavailable.");
        }
    }
    public void display_Details() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.printf("Price: $%.2f%n", this.price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Unavailable"));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String userTitle = scanner.nextLine();
        System.out.print("Enter author name: ");
        String userAuthor = scanner.nextLine();
        System.out.print("Enter price: ");
        double userPrice = scanner.nextDouble();
        scanner.nextLine();
        Book_2 libraryBook = new Book_2(userTitle, userAuthor, userPrice, true);
        System.out.println("\nBook added to the library:");
        libraryBook.display_Details();
        System.out.println("\nAttempting to borrow the book...");
        libraryBook.borrow_Book();
        System.out.println("\nUpdated book details:");
        libraryBook.display_Details();
        System.out.println("\nAttempting to borrow the same book again...");
        libraryBook.borrow_Book();
        scanner.close();
    }
}