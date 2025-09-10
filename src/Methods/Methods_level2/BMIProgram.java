package Methods.Methods_level2;

import java.util.Scanner;

public class BMIProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[10][3];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) of person " + (i + 1) + ": ");
            arr[i][0] = sc.nextDouble();
            System.out.print("Enter height(cm) of person " + (i + 1) + ": ");
            arr[i][1] = sc.nextDouble();
            arr[i][2] = calculateBMI(arr[i][0], arr[i][1]);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + " -> Weight: " + arr[i][0] + " Height: " + arr[i][1] + " BMI: " + arr[i][2] + " Status: " + bmiStatus(arr[i][2]));
        }
    }
    public static double calculateBMI(double weight, double heightCm) {
        double h = heightCm / 100;
        return weight / (h * h);
    }
    public static String bmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }
}
