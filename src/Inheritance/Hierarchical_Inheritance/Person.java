package Inheritance.Hierarchical_Inheritance;
import java.util.Scanner;
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display_Details() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    void display_Role() {
        System.out.println("Role: Teacher");
        display_Details();
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    int grade;
    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    void display_Role() {
        System.out.println("Role: Student");
        display_Details();
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    String department;
    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }
    void display_Role() {
        System.out.println("Role: Staff");
        display_Details();
        System.out.println("Department: " + department);
    }
}
 class School_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Role: 1. Teacher 2. Student 3. Staff");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Enter Subject: ");
                String subject = sc.nextLine();
                Teacher t = new Teacher(name, age, subject);
                t.display_Role();
                break;
            case 2:
                System.out.print("Enter Grade: ");
                int grade = sc.nextInt();
                Student s = new Student(name, age, grade);
                s.display_Role();
                break;
            case 3:
                System.out.print("Enter Department: ");
                String dept = sc.nextLine();
                Staff st = new Staff(name, age, dept);
                st.display_Role();
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}
