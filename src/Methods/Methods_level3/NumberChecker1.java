package Methods.Methods_level3;

import java.util.*;

public class NumberChecker1 {
    public static void main(String[] args) {
        int number = 153;
        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Digits: " + Arrays.toString(digitsArray(number)));
        System.out.println("Duck Number: " + isDuck(number));
        System.out.println("Armstrong Number: " + isArmstrong(number));
        findLargestAndSecondLargest(number);
        findSmallestAndSecondSmallest(number);
    }

    static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    static int[] digitsArray(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    static boolean isDuck(int n) {
        String s = String.valueOf(n);
        return s.contains("0");
    }

    static boolean isArmstrong(int n) {
        int[] d = digitsArray(n);
        int p = d.length, sum = 0;
        for (int x : d) sum += Math.pow(x, p);
        return sum == n;
    }

    static void findLargestAndSecondLargest(int n) {
        int[] d = digitsArray(n);
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > first) {
                second = first;
                first = x;
            } else if (x > second && x != first) second = x;
        }
        System.out.println("Largest: " + first + ", Second Largest: " + second);
    }

    static void findSmallestAndSecondSmallest(int n) {
        int[] d = digitsArray(n);
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < first) {
                second = first;
                first = x;
            } else if (x < second && x != first) second = x;
        }
        System.out.println("Smallest: " + first + ", Second Smallest: " + second);
    }
}

