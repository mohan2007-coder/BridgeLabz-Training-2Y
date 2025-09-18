package Inheritance.Assisted_Problems;
import java.util.Scanner;
class Employee_3 {
    String name;
    int id;
    double salary;
    Employee_3(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void display_Details() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}
class Manager extends Employee_3 {
    int team_Size;
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.team_Size = team_Size;
    }
    void display_Details() {
        super.display_Details();
        System.out.println("Team Size: " + team_Size);
    }
}
class Developer extends Employee_3 {
    String programming_Language;
    Developer(String name, int id, double salary, String programming_Language) {
        super(name, id, salary);
        this.programming_Language = programming_Language;
    }
    void displayDetails() {
        super.display_Details();
        System.out.println("Programming Language: " + programming_Language);
    }
}

class Intern extends Employee_3 {
    int duration;
    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }
    void display_Details() {
        super.display_Details();
        System.out.println("Internship Duration: " + duration + " months");
    }
}
class Employee_Management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee type (manager/developer/intern): ");
        String type = sc.nextLine().toLowerCase();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        Employee_3 emp;
        if (type.equals("manager"))
        {
            System.out.print("Enter team size: ");
            int teamSize = sc.nextInt();
            emp = new Manager(name, id, salary, teamSize);
        }
        else if (type.equals("developer"))
        {
            System.out.print("Enter programming language: ");
            String lang = sc.nextLine();
            emp = new Developer(name, id, salary, lang);
        }
        else if (type.equals("intern"))
        {
            System.out.print("Enter duration (months): ");
            int duration = sc.nextInt();
            emp = new Intern(name, id, salary, duration);
        }
        else
        {
            emp = new Employee_3(name, id, salary);
        }

        emp.display_Details();
        sc.close();
    }
}

