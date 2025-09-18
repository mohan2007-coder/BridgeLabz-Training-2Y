package programming_elements;

import java.util.Scanner;

public class FindSideOfSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter perimeter of square:");
        float a=sc.nextFloat();
        float b=a/4;
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f",b,a);

    }
}
