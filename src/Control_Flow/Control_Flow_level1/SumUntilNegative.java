package Control_Flow.Control_Flow_level1;
import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            if (num <= 0) {
                break; // stop the loop
            }
            total += num;
        }

        System.out.println("The total sum is: " + total);
        sc.close();
    }
}