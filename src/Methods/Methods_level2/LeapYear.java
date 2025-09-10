package Methods.Methods_level2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if (year < 1582) {
            System.out.println("Invalid Year");
            return;
        }
        if (isLeap(year)) System.out.println("Leap Year");
        else System.out.println("Not a Leap Year");
    }
    public static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
}
