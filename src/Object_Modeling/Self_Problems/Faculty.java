package Object_Modeling.Self_Problems;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;
    private List<Faculty> faculties;

    public Department(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        this.faculties.add(faculty);
    }

    public void displayFaculties() {
        System.out.println("Faculties in " + name + " Department:");
        if (faculties.isEmpty()) {
            System.out.println("No faculties.");
        } else {
            for (Faculty f : faculties) {
                System.out.println("- " + f.getName());
            }
        }
    }
}

class University {
    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    public void displayDepartments() {
        System.out.println("Departments in " + name + " University:");
        if (departments.isEmpty()) {
            System.out.println("No departments.");
        } else {
            for (Department d : departments) {
                System.out.println("- " + d.getClass());
            }
        }
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter university name: ");
        String uniName = scanner.nextLine();
        University university = new University(uniName);

        System.out.print("Enter number of departments: ");
        int numDepartments = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numDepartments; i++) {
            System.out.print("Enter name for department " + (i + 1) + ": ");
            university.addDepartment(new Department(scanner.nextLine()));
        }

        Faculty faculty1 = new Faculty("Dr. Smith");
        Faculty faculty2 = new Faculty("Dr. Jones");
        System.out.println("\nFaculty members created independently.");

        System.out.println("University and its departments are now tied by composition.");
        System.out.println("Deleting the University will delete its departments.");
        university = null;
        System.out.println("University object set to null.");
        System.out.println("The departments are now subject to garbage collection as they cannot exist without the university.");
        System.out.println("However, the Faculty members still exist independently.");

        System.out.println("\nChecking if faculty still exist:");
        System.out.println("Faculty 1 name: " + faculty1.getName());
        System.out.println("Faculty 2 name: " + faculty2.getName());

        scanner.close();
    }
}