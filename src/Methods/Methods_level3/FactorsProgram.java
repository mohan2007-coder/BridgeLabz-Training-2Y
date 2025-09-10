package Methods.Methods_level3;

import java.util.*;

public class FactorsProgram {
    public static void main(String[] args) {
        int number = 12;
        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + greatestFactor(number));
        System.out.println("Sum of Factors: " + sumOfFactors(number));
        System.out.println("Product of Factors: " + productOfFactors(number));
        System.out.println("Product of Cubes of Factors: " + productOfCubesOfFactors(number));
    }

    static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] arr = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) arr[idx++] = i;
        return arr;
    }

    static int greatestFactor(int n) {
        return n;
    }

    static int sumOfFactors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) sum += i;
        return sum;
    }

    static long productOfFactors(int n) {
        long prod = 1;
        for (int i = 1; i <= n; i++) if (n % i == 0) prod *= i;
        return prod;
    }

    static long productOfCubesOfFactors(int n) {
        long prod = 1;
        for (int i = 1; i <= n; i++) if (n % i == 0) prod *= Math.pow(i, 3);
        return prod;
    }
}

