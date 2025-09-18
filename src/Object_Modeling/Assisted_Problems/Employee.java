package Object_Modeling.Assisted_Problems;
import java.util.*;

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("  Department: ").append(name).append("\n");
        for (Employee emp : employees) {
            sb.append("    - ").append(emp).append("\n");
        }
        return sb.toString();
    }
}

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void companyInfo() {
        System.out.println("Company: " + name);
        System.out.println("Departments:");
        for (Department dept : departments) {
            System.out.println(dept);
        }
    }
}

 class Employee_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter company name: ");
        String companyName = sc.nextLine();
        Company myCompany = new Company(companyName);
        System.out.print("Enter number of departments: ");
        int numDepartments = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numDepartments; i++) {
            System.out.print("Enter department " + (i + 1) + " name: ");
            String deptName = sc.nextLine();
            Department newDepartment = new Department(deptName);
            System.out.print("Enter number of employees in " + deptName + ": ");
            int numEmployees = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < numEmployees; j++) {
                System.out.print("Enter employee " + (j + 1) + " name: ");
                String empName = sc.nextLine();
                System.out.print("Enter employee ID: ");
                int empId = sc.nextInt();
                sc.nextLine();
                newDepartment.addEmployee(new Employee(empName, empId));
            }
            myCompany.addDepartment(newDepartment);
        }
        System.out.println("\n--- Company Details ---");
        myCompany.companyInfo();
        System.out.println("--- End of Company Details ---");
        sc.close();
    }
}