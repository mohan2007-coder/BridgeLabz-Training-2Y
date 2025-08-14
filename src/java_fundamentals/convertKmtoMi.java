package java_fundamentals;

import java.util.*;

public class convertKmtoMi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();

        double miles = km * 0.621371;

        System.out.println(km + " kilometers is equal to " + miles + " miles.");
        sc.close();
    }
}
