package Methods.Methods_level1;

import java.util.Scanner;

public class Trigonometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        double[] result = calculateTrigonometricFunctions(angle);
        System.out.println("Sine = " + result[0]);
        System.out.println("Cosine = " + result[1]);
        System.out.println("Tangent = " + result[2]);
    }
    public static double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        double sine = Math.sin(rad);
        double cosine = Math.cos(rad);
        double tangent = Math.tan(rad);
        return new double[]{sine, cosine, tangent};
    }
}

