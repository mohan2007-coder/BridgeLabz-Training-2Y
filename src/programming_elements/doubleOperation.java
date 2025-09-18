package programming_elements;

import java.util.Scanner;

public class doubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr First number :");
        double a = sc.nextDouble();
        System.out.print("Enetr Second number :");
        double b = sc.nextDouble();
        System.out.print("Enetr Third number :");
        double c = sc.nextDouble();
        double d = a + b * c;
        double e = a * b + c;
        double f = c + a / b;
        double g = a % b + c;
        System.out.printf("The results of Int Operations are %.2f, %.2f,%.2f, and %.2f", d, e, f, g);
    }
}
