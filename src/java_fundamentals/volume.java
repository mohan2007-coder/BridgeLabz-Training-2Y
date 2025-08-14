package java_fundamentals;/*//Write a program to calculate the java_fundamentals.volume of a cylinder. Take the radius and
//height as inputs and use the formula:
Volume = π * radius^2 * height.*/
import java.util.*;
public class volume{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height:");

        int h=sc.nextInt();
        System.out.println("Enter the radius:");
        int r=sc.nextInt();
        Float volume=3.14f*r*r*h;
        System.out.println("The java_fundamentals.volume of the cylinder"+volume);

    }

}