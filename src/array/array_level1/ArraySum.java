package array.array_level1;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);
        int count = 0, sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int input = sc.nextInt();
            if (input <= 0) {
                break;
            }
            numbers[count] = input;
            sum += input;
            count++;
        }

        System.out.print("Numbers entered: ");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nSum of numbers: " + sum);
        sc.close();
    }
}

