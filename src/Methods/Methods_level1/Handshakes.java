package Methods.Methods_level1;

import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int handshakes = calculateHandshakes(n);
        System.out.println("Maximum handshakes possible: " + handshakes);
    }
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}
