package Control_Flow.Control_Flow_level1;
import java.util.Scanner;

public class NaturalSumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 0) {
            int sumwithFormula = n * (n + 1) / 2;

            int sumwithFor = 0;
            for (int i = 1; i <= n; i++) {
                sumwithFor += i;
            }

            System.out.println("Formula result: " + sumwithFormula);
            System.out.println("For loop result: " + sumwithFor);
            System.out.println("Both results are equal? " + (sumwithFormula == sumwithFor));
        } else {
            System.out.println("The number is not a natural number");
        }
    }
}
