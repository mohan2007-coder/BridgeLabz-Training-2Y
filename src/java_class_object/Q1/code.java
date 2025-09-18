import java.util.ArrayList;

class Course {
    String title;
    ArrayList<Student> students;

    Course(String title) {
        this.title = title;
        this.students = new ArrayList<>();
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("Students enrolled in " + title + ":");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses;

    Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void enroll(Course c) {
        courses.add(c);
        c.addStudent(this); // association both ways
    }

    void viewCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.title);
        }
    }
}

class School {
    String name;
    ArrayList<Student> students;

    School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("Students of " + name + ":");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        School school = new School("GLA University");

        Student s1 = new Student("Ankit");
        Student s2 = new Student("Rahul");

        Course c1 = new Course("Java");
        Course c2 = new Course("Python");

        // Aggregation: School contains students
        school.addStudent(s1);
        school.addStudent(s2);

        // Association: Students enroll in multiple courses
        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);

        // Display
        school.showStudents();
        s1.viewCourses();
        s2.viewCourses();

        c1.showStudents();
        c2.showStudents();
    }
}
