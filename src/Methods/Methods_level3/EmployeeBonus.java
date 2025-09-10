package Methods.Methods_level3;

import java.util.Random;

public class EmployeeBonus {
    public static void main(String[] args) {
        int employees = 10;
        int[][] data = generateEmployeeData(employees);
        double[][] result = calculateNewSalaryAndBonus(data);

        displaySummary(data, result);
    }

    // Generate salary and years of service randomly
    static int[][] generateEmployeeData(int n) {
        Random rand = new Random();
        int[][] empData = new int[n][2]; // [salary, years of service]

        for (int i = 0; i < n; i++) {
            int salary = 10000 + rand.nextInt(90000); // 5-digit salary
            int years = 1 + rand.nextInt(15); // service between 1–15 years
            empData[i][0] = salary;
            empData[i][1] = years;
        }
        return empData;
    }

    // Calculate new salary and bonus
    static double[][] calculateNewSalaryAndBonus(int[][] empData) {
        double[][] result = new double[empData.length][2]; // [new salary, bonus]

        for (int i = 0; i < empData.length; i++) {
            int oldSalary = empData[i][0];
            int years = empData[i][1];
            double bonus;

            if (years > 5) bonus = oldSalary * 0.05;
            else bonus = oldSalary * 0.02;

            result[i][0] = oldSalary + bonus; // new salary
            result[i][1] = bonus;
        }
        return result;
    }

    // Display old salary, years, bonus, and new salary in tabular format
    static void displaySummary(int[][] empData, double[][] result) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.printf("%-10s %-12s %-10s %-12s %-12s%n",
                "EmpID", "OldSalary", "Years", "Bonus", "NewSalary");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < empData.length; i++) {
            totalOld += empData[i][0];
            totalNew += result[i][0];
            totalBonus += result[i][1];

            System.out.printf("%-10d %-12d %-10d %-12.2f %-12.2f%n",
                    (i + 1), empData[i][0], empData[i][1], result[i][1], result[i][0]);
        }

        System.out.println("-----------------------------------------------------");
        System.out.printf("TOTALS    %-12.2f %-10s %-12.2f %-12.2f%n",
                totalOld, "-", totalBonus, totalNew);
    }
}

