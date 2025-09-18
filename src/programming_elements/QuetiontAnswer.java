package programming_elements;

import java.util.Scanner;

public class QuetiontAnswer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number :");
        float a= sc.nextFloat();
        System.out.print("Enter 2nd number :");
        float b= sc.nextFloat();
        float c= a/b;
        float d= a%b;
        System.out.printf("The Quotient is %.0f and Reminder is %.2f of two number %.2f and %.2f",c,d,a,b);
    }
}
