package String.String_level1;

import java.util.Scanner;

public class NumberFormatDemo {
    public static void generateException(String text) {
        int number = Integer.parseInt(text); // If text is not a number
        System.out.println("Number: " + number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number text: ");
        String text = sc.next();

        // generateException(text);
        handleException(text);
    }
}
