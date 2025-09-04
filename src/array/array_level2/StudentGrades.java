package array.array_level2;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks in Physics for student " + (i + 1) + ": ");
            physics[i] = sc.nextDouble();
            System.out.print("Enter marks in Chemistry for student " + (i + 1) + ": ");
            chemistry[i] = sc.nextDouble();
            System.out.print("Enter marks in Maths for student " + (i + 1) + ": ");
            maths[i] = sc.nextDouble();

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;
            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 75) grade[i] = 'B';
            else if (percentage[i] >= 50) grade[i] = 'C';
            else grade[i] = 'F';
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                    " - Percentage: " + percentage[i] +
                    "%, Grade: " + grade[i]);
        }

        sc.close();
    }
}
