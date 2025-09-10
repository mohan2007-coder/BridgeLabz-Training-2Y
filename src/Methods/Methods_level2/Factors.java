package Methods.Methods_level2;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] factors = findFactors(n);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();
        System.out.println("Sum = " + sumFactors(factors));
        System.out.println("Sum of Squares = " + sumSquares(factors));
        System.out.println("Product = " + productFactors(factors));
    }
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] arr = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) arr[idx++] = i;
        return arr;
    }
    public static int sumFactors(int[] arr) {
        int sum = 0;
        for (int f : arr) sum += f;
        return sum;
    }
    public static int sumSquares(int[] arr) {
        int sum = 0;
        for (int f : arr) sum += Math.pow(f, 2);
        return sum;
    }
    public static int productFactors(int[] arr) {
        int product = 1;
        for (int f : arr) product *= f;
        return product;
    }
}


