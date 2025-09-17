package Java_constructors;

import java.util.Scanner;
public class Hotel_Booking {
    String guestName;
    String roomType;
    int nights;
    public Hotel_Booking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }
    public Hotel_Booking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public Hotel_Booking(Hotel_Booking original_Booking) {
        this.guestName = original_Booking.guestName;
        this.roomType = original_Booking.roomType;
        this.nights = original_Booking.nights;
    }
    public void display_Booking_Details() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creating a default booking:");
        Hotel_Booking default_Booking = new Hotel_Booking();
        default_Booking.display_Booking_Details();
        System.out.println("\n----------------------------------------\n");
        System.out.println("Enter details for a new booking:");
        System.out.print("Guest Name: ");
        String name = scanner.nextLine();
        System.out.print("Room Type: ");
        String room = scanner.nextLine();
        System.out.print("Number of nights: ");
        int nights = scanner.nextInt();
        Hotel_Booking newBooking = new Hotel_Booking(name, room, nights);
        System.out.println("\nParameterized booking created:");
        newBooking.display_Booking_Details();
        System.out.println("\n----------------------------------------\n");
        System.out.println("Creating a copy of the new booking:");
        Hotel_Booking copied_Booking = new Hotel_Booking(newBooking);
        copied_Booking.display_Booking_Details();
        scanner.close();
    }
}
