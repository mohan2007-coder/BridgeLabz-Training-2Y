package programming_elements;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 number: ");
        int a= sc.nextInt();
        System.out.print("Enter 2 number: ");
        int b= sc.nextInt();
        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        float div = a/b;
        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %d and %d is %d, %d, %d, and %f\n",a,b,add ,sub,mul,div);
    }
}
