package Javaclass.Level_1;

import java.util.Scanner;

public class Employee_class {
    String name;
    int id;
    double salary;

    public Employee_class(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + String.format("%,.2f", salary));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee name:");
        String empName = scanner.nextLine();

        System.out.println("Enter employee ID:");
        int empId = scanner.nextInt();

        System.out.println("Enter employee salary:");
        double empSalary = scanner.nextDouble();

        scanner.close();

        Employee_class emp1 = new Employee_class(empName, empId, empSalary);
        emp1.displayDetails();
    }
}
