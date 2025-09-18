package Class_Object_Sequenece_Diagram;
import java.util.*;
class Subject {
    private String name;
    private int marks;

    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

class Student {
    private String name;
    private List<Subject> subjects;

    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}

class GradeCalculator {
    public String calculateGrade(Student student) {
        int totalMarks = 0;
        for (Subject subject : student.getSubjects()) {
            totalMarks += subject.getMarks();
        }
        double average = (double) totalMarks / student.getSubjects().size();
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();
        Student student = new Student(studentName);
        System.out.print("Enter number of subjects: ");
        int numSubjects = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter subject name " + (i + 1) + ": ");
            String subjectName = sc.nextLine();
            System.out.print("Enter marks for " + subjectName + ": ");
            int marks = sc.nextInt();
            sc.nextLine();
            student.addSubject(new Subject(subjectName, marks));
        }
        GradeCalculator calculator = new GradeCalculator();
        String grade = calculator.calculateGrade(student);
        System.out.println("Student: " + student.getName());
        System.out.println("Final Grade: " + grade);
        sc.close();
    }
}