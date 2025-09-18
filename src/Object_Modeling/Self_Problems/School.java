package Object_Modeling.Self_Problems;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class School {
    private String name;
    private List<Student> students;
    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        this.students.add(student);
    }
    public void getStudents() {
        System.out.println("Students in " + this.name + ":");
        if (students.isEmpty()) {
            System.out.println("No students enrolled.");
            return;
        }
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

class Course {
    private String name;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void addStudent(Student student) {
        this.students.add(student);
    }
    public void getStudents() {
        System.out.println("Students in " + this.name + ":");
        if (students.isEmpty()) {
            System.out.println("No students enrolled.");
            return;
        }
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        this.courses.add(course);
        course.addStudent(this);
    }

    public void getCourses() {
        System.out.println("Courses for " + this.name + ":");
        if (courses.isEmpty()) {
            System.out.println("No courses enrolled.");
            return;
        }
        for (Course c : courses) {
            System.out.println("- " + c.getName());
        }
    }
}

 class Student_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter school name: ");
        String schoolName = scanner.nextLine();
        School school = new School(schoolName);

        System.out.print("Enter number of students to add: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            Student student = new Student(studentName);
            school.addStudent(student);
            students.add(student);
        }

        System.out.print("Enter number of courses to create: ");
        int numCourses = scanner.nextInt();
        scanner.nextLine();

        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter name for course " + (i + 1) + ": ");
            String courseName = scanner.nextLine();
            courses.add(new Course(courseName));
        }

        while (true) {
            System.out.println("\n--- Actions ---");
            System.out.println("1. Enroll a student in a course");
            System.out.println("2. View a student's courses");
            System.out.println("3. View a course's students");
            System.out.println("4. View all students in the school");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name to enroll: ");
                    String enrollStudentName = scanner.nextLine();
                    System.out.print("Enter course name to enroll in: ");
                    String enrollCourseName = scanner.nextLine();

                    Student studentToEnroll = students.stream().filter(s -> s.getName().equals(enrollStudentName)).findFirst().orElse(null);
                    Course courseToEnrollIn = courses.stream().filter(c -> c.getName().equals(enrollCourseName)).findFirst().orElse(null);

                    if (studentToEnroll != null && courseToEnrollIn != null) {
                        studentToEnroll.enrollInCourse(courseToEnrollIn);
                        System.out.println("Enrollment successful!");
                    } else {
                        System.out.println("Student or Course not found.");
                    }
                    break;
                case 2:
                    System.out.print("Enter student name to view courses: ");
                    String viewStudentName = scanner.nextLine();
                    Student studentToViewCourses = students.stream().filter(s -> s.getName().equals(viewStudentName)).findFirst().orElse(null);
                    if (studentToViewCourses != null) {
                        studentToViewCourses.getCourses();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter course name to view students: ");
                    String viewCourseName = scanner.nextLine();
                    Course courseToViewStudents = courses.stream().filter(c -> c.getName().equals(viewCourseName)).findFirst().orElse(null);
                    if (courseToViewStudents != null) {
                        courseToViewStudents.getStudents();
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;
                case 4:
                    school.getStudents();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
