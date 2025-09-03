package Control_Flow.Control_Flow_level1;
import java.util.Scanner;

public class SumUntil0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        while (num != 0) {
            total += num;
            System.out.print("Enter a number: ");
            num = sc.nextDouble();
        }

        System.out.println("Total = " + total);
    }
}
