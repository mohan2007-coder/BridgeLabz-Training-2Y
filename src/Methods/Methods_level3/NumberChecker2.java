package Methods.Methods_level3;

import java.util.*;

public class NumberChecker2 {
    public static void main(String[] args) {
        int number = 21;
        System.out.println("Number: " + number);
        System.out.println("Sum of Digits: " + sumOfDigits(number));
        System.out.println("Sum of Squares of Digits: " + sumOfSquaresOfDigits(number));
        System.out.println("Harshad Number: " + isHarshad(number));
        System.out.println("Digit Frequencies: " + Arrays.deepToString(digitFrequency(number)));
    }

    static int[] digitsArray(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    static int sumOfDigits(int n) {
        int sum = 0;
        for (int x : digitsArray(n)) sum += x;
        return sum;
    }

    static int sumOfSquaresOfDigits(int n) {
        int sum = 0;
        for (int x : digitsArray(n)) sum += Math.pow(x, 2);
        return sum;
    }

    static boolean isHarshad(int n) {
        return n % sumOfDigits(n) == 0;
    }

    static int[][] digitFrequency(int n) {
        int[] d = digitsArray(n);
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int x : d) freq[x][1]++;
        return freq;
    }
}
