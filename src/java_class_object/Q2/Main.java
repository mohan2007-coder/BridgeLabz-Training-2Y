 import java.util.ArrayList;

class Department {
    String name;
    Department(String name) {
        this.name = name;
    }
}

class Faculty {
    String name;
    String subject;

    Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
}

class University {
    String name;
    ArrayList<Department> departments;
    ArrayList<Faculty> faculties;

    University(String name) {
        this.name = name;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void showDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department d : departments) {
            System.out.println("- " + d.name);
        }
    }

    void showFaculties() {
        System.out.println("Faculties in " + name + ":");
        for (Faculty f : faculties) {
            System.out.println("- " + f.name + " (" + f.subject + ")");
        }
    }

    void deleteUniversity() {
        departments.clear();  // Composition effect: all departments deleted
        System.out.println(name + " is deleted. All departments removed.");
    }
}

public class Main {
    public static void main(String[] args) {
        University uni = new University("GLA University");

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Electronics");

        Faculty f1 = new Faculty("Dr. Sharma", "AI");
        Faculty f2 = new Faculty("Prof. Mehta", "Math");

        // Composition: Departments belong to University
        uni.addDepartment(d1);
        uni.addDepartment(d2);

        // Aggregation: Faculties can exist outside University
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showDepartments();
        uni.showFaculties();

        // Demonstrate composition effect
        uni.deleteUniversity();
        uni.showDepartments(); // will be empty now
    }
}

}
