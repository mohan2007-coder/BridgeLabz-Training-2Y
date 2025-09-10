package Methods.Methods_level2;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        double[] roots = findRoots(a, b, c);
        if (roots.length == 0) System.out.println("No Real Roots");
        else if (roots.length == 1) System.out.println("Root: " + roots[0]);
        else System.out.println("Roots: " + roots[0] + ", " + roots[1]);
    }
    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) return new double[]{};
        else if (delta == 0) return new double[]{-b / (2 * a)};
        else {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{r1, r2};
        }
    }
}
