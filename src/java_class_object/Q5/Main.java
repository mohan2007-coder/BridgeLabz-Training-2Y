import java.util.ArrayList;

class Professor {
    String name;
    int id;
    ArrayList<Course> courses = new ArrayList<>();

    Professor(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void assignCourse(Course c) {
        courses.add(c);
        c.assignProfessor(this);
        System.out.println(name + " is now teaching " + c.title);
    }

    void showCourses() {
        System.out.println("Courses taught by " + name + ":");
        for (Course c : courses) {
            System.out.println("- " + c.title);
        }
    }
}

class Student {
    String name;
    int id;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void enrollCourse(Course c) {
        courses.add(c);
        c.students.add(this);
        System.out.println(name + " enrolled in " + c.title);
    }

    void showCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course c : courses) {
            System.out.println("- " + c.title);
        }
    }
}

class Course {
    String code;
    String title;
    Professor professor;
    ArrayList<Student> students = new ArrayList<>();

    Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    void assignProfessor(Professor p) {
        this.professor = p;
    }

    void showStudents() {
        System.out.println("Students in " + title + ":");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create professors
        Professor p1 = new Professor("Dr. Sharma", 101);

        // Create students
        Student s1 = new Student("Ankit", 1);
        Student s2 = new Student("Ravi", 2);

        // Create courses
        Course c1 = new Course("CS101", "OOPS");
        Course c2 = new Course("CS102", "Data Structures");

        // Assign professor to courses
        p1.assignCourse(c1);
        p1.assignCourse(c2);

        // Students enroll in courses
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s1.enrollCourse(c2);

        // Show enrolled data
        s1.showCourses();
        c1.showStudents();
        p1.showCourses();
    }
}
