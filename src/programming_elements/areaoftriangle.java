package programming_elements;

import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter height in centimeter:");
        float height=sc.nextFloat();
        System.out.print("Enter base in centimeter:");
        double base=sc.nextFloat();
        double a=height/2.54;
        double b=a/12;
        double c=(base*height)/2;
        System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f\n",height,b,a);
        System.out.printf("Area of triangle is: %.2f",c);
    }
}
