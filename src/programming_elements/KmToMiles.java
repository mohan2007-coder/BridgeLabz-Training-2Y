package programming_elements;

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value:");
        float b = sc.nextFloat();
        double miles = b * 1.6;
        System.out.printf("The total miles is %.1f mile for the given %.1f km", miles, b);

    }
}
