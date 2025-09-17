package Javaclass.Lavel_2;

import java.util.Scanner;
public class Student {
    private String name;
    private int rollNumber;
    private int marks;
    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public String calculateGrade() {
        if (marks >= 90)
        {
            return "A";
        }
        else if (marks >= 80)
        {
            return "B";
        }
        else if (marks >= 70)
        {
            return "C";
        }
        else if (marks >= 60)
        {
            return "D";
        }
        else
        {
            return "F";
        }
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student details:");
        System.out.print("Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Roll Number: ");
        int studentRollNumber = scanner.nextInt();
        System.out.print("Marks: ");
        int studentMarks = scanner.nextInt();
        Student newStudent = new Student(studentName, studentRollNumber, studentMarks);
        System.out.println("\n--- Student Report ---");
        newStudent.displayDetails();
        scanner.close();
    }
}
