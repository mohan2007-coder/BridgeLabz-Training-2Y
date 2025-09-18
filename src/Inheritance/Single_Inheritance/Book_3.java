package Inheritance.Single_Inheritance;
import java.util.Scanner;
class Book_3 {
    String title;
    int publication_Year;
    Book_3(String title, int publicationYear) {
        this.title = title;
        this.publication_Year = publicationYear;
    }
    void display_Info() {
        System.out.println("Title: " + title + ", Year: " + publication_Year);
    }
}
class Author extends Book_3 {
    String name;
    String bio;
    Author(String title, int publication_Year, String name, String bio) {
        super(title, publication_Year);
        this.name = name;
        this.bio = bio;
    }
    void display_Info() {
        super.display_Info();
        System.out.println("Author: " + name + ", Bio: " + bio);
    }
}
class Library_Management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        System.out.print("Enter publication year: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter author name: ");
        String authorName = sc.nextLine();
        System.out.print("Enter author bio: ");
        String bio = sc.nextLine();
        Author book = new Author(title, year, authorName, bio);
        System.out.println("\nBook Details:");
        book.display_Info();
        sc.close();
    }
}
