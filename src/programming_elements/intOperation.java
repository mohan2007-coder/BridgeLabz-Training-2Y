package programming_elements;

import java.util.Scanner;

public class intOperation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enetr First number :");
        int a = sc.nextInt();
        System.out.print("Enetr Second number :");
        int b= sc.nextInt();
        System.out.print("Enetr Third number :");
        int c= sc.nextInt();
        int d= a+b*c;
        int e= a*b+c;
        int f= c+a/b;
        int g= a%b+c;
        System.out.printf("The results of Int Operations are %d, %d,%d, and %d",d,e,f,g);
    }
}
