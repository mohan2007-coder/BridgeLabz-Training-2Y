package java_fundamentals;/*Write a program to calculate the java_fundamentals.area of a circle. Take the radius as input
and use the formula:
Area = π * radius^2.*/
import java.util.*;
public class area{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        int r=sc.nextInt();
        Float area=3.14f*r*r;
        System.out.println("The java_fundamentals.area of the circle is:"+area);

    }
}

