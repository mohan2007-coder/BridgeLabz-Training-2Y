package programming_elements;

import java.util.Scanner;

public class ConvertDisInYardAndMiles {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter distance in feets :");
        float a= sc.nextFloat();
        float yards=  a/3;
        double miles = yards*0.000568;
        System.out.printf("Your Distance in feets is %.2f while in yards is %.2f and miles is %.6f\n",a,yards,miles);
    }
}
