package Methods.Methods_level3;

import java.util.*;

public class NumberChecker3 {
    public static void main(String[] args) {
        int number = 121;
        System.out.println("Number: " + number);
        System.out.println("Palindrome: " + isPalindrome(number));
        System.out.println("Duck Number: " + isDuck(number));
    }

    static int[] digitsArray(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    static int[] reverseDigits(int n) {
        int[] d = digitsArray(n);
        int[] rev = new int[d.length];
        for (int i = 0; i < d.length; i++) rev[i] = d[d.length - 1 - i];
        return rev;
    }

    static boolean isPalindrome(int n) {
        return Arrays.equals(digitsArray(n), reverseDigits(n));
    }

    static boolean isDuck(int n) {
        String s = String.valueOf(n);
        return s.contains("0");
    }
}

