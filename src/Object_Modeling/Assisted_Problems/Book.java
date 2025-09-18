package Object_Modeling.Assisted_Problems;
import java.util.*;
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return title + " by " + author;
    }
}

class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Library: ").append(name).append("\n");
        sb.append("Books:\n");
        for (Book book : books) {
            sb.append("- ").append(book).append("\n");
        }
        return sb.toString();
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter library name: ");
        String libraryName = sc.nextLine();
        Library myLibrary = new Library(libraryName);
        System.out.print("Enter number of books to add: ");
        int numBooks = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numBooks; i++) {
            System.out.print("Enter title of book " + (i + 1) + ": ");
            String title = sc.nextLine();
            System.out.print("Enter author of book " + (i + 1) + ": ");
            String author = sc.nextLine();
            Book newBook = new Book(title, author);
            myLibrary.addBook(newBook);
        }
        System.out.println("\n" + myLibrary);
        sc.close();
    }
}