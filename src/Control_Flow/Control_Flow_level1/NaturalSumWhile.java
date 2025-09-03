package Control_Flow.Control_Flow_level1;
import java.util.Scanner;

public class NaturalSumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {
            int Sum = n * (n + 1) / 2;

            int total = 0;
            int i = 1;
            while (i <= n) {
                total += i;
                i++;
            }

            System.out.println("Sum with while loop: " + total);
            System.out.println("Sum with formula: " + Sum);
            System.out.println("Both results are same: " + (total == Sum));
        } else {
            System.out.println("Please enter a natural number.");
        }
        sc.close();
    }
}