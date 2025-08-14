package java_fundamentals;/*Write a program that takes the temperature in Celsius as input and converts
it to Fahrenheit using the formula:
Fahrenheit = (Celsius * 9/5) + 32.*/
import java.util.*;
public class temp{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temprature in celcius:");
        Float a=sc.nextFloat();
        Float t=(a * 1.8f) + 32;
        System.out.println("Enter temprature in fahrenhiet:"+t);
    }
}
