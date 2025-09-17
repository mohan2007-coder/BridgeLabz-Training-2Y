package Javaclass.Lavel_2;

import java.util.Scanner;
public class Movie_Ticket {
    private String movieName;
    private int seatNumber;
    private double price;
    public Movie_Ticket(String movieName) {
        this.movieName = movieName;
    }
    public void book_Ticket(int seatNumber, double basePrice) {
        this.seatNumber = seatNumber;
        this.price = basePrice;
        System.out.println("Ticket booked successfully!");
    }
    public void display_Ticket_Details() {
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.printf("Price: $%.2f%n", price);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Movie Ticket Booking System!");
        System.out.print("Enter movie name: ");
        String movie = scanner.nextLine();
        Movie_Ticket ticket = new Movie_Ticket(movie);
        System.out.print("Enter desired seat number: ");
        int seat = scanner.nextInt();
        System.out.print("Enter ticket price: ");
        double ticketPrice = scanner.nextDouble();
        ticket.book_Ticket(seat, ticketPrice);
        ticket.display_Ticket_Details();
        scanner.close();
    }
}