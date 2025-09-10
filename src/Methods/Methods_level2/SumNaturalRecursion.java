package Methods.Methods_level2;
import java.util.Scanner;

public class SumNaturalRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }
        int sumRec = sumRecursion(n);
        int sumFormula = n * (n + 1) / 2;
        System.out.println("Sum by Recursion = " + sumRec);
        System.out.println("Sum by Formula = " + sumFormula);
    }
    public static int sumRecursion(int n) {
        if (n == 1) return 1;
        return n + sumRecursion(n - 1);
    }
}

