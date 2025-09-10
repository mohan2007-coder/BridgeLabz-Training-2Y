package Methods.Methods_level2;

import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];
        String[] names = {"Amar", "Akbar", "Anthony"};
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }
        System.out.println("Youngest: " + names[findYoungest(ages)]);
        System.out.println("Tallest: " + names[findTallest(heights)]);
    }
    public static int findYoungest(int[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) if (arr[i] < arr[minIndex]) minIndex = i;
        return minIndex;
    }
    public static int findTallest(int[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) if (arr[i] > arr[maxIndex]) maxIndex = i;
        return maxIndex;
    }
}

