package Methods.Methods_level3;

import java.util.Scanner;

public class CollinearPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt(), y3 = sc.nextInt();

        // Checking using slope formula
        if (checkCollinearSlope(x1, y1, x2, y2, x3, y3))
            System.out.println("Points are Collinear (using slope method)");
        else
            System.out.println("Points are NOT Collinear (using slope method)");

        // Checking using area of triangle
        if (checkCollinearArea(x1, y1, x2, y2, x3, y3))
            System.out.println("Points are Collinear (using area method)");
        else
            System.out.println("Points are NOT Collinear (using area method)");
    }

    // Method 1: Slope Method
    static boolean checkCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Slopes AB and AC are equal => (y2-y1)*(x3-x1) == (y3-y1)*(x2-x1)
        return (y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1);
    }

    // Method 2: Area of triangle Method
    static boolean checkCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }
}

