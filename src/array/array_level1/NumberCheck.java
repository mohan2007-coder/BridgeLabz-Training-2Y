package array.array_level1;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even.");
                } else {
                    System.out.println(num + " is Positive and Odd.");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative.");
            } else {
                System.out.println(num + " is Zero.");
            }
        }

        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and last elements are Equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is Greater than the last element.");
        } else {
            System.out.println("First element is Less than the last element.");
        }

        sc.close();
    }
}

