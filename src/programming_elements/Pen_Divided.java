package programming_elements;
import java.util.Scanner;
public class Pen_Divided {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a= 14/3;
        float b= 14%3;
        System.out.printf("The Pen Per Student is %.1f and the remaining pen not distributed is %.1f",a,b);
    }
}
