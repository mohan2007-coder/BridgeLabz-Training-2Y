package programming_elements;

import java.util.Scanner;

public class heightConvert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter height in centimeter:");
        float height=sc.nextInt();
        double a=height/2.54;
        double b=a/12;
        System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f",height,b,a);
    }
}
