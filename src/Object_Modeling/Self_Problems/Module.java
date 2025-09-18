package Object_Modeling.Self_Problems;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Module {
    private String name;
    private Instructor instructor;
    private List<Scholar> scholars;

    public Module(String name) {
        this.name = name;
        this.scholars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public List<Scholar> getScholars() {
        return scholars;
    }

    public void assignInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void enrollScholar(Scholar scholar) {
        this.scholars.add(scholar);
    }
}

class Scholar {
    private String name;
    private List<Module> modules;

    public Scholar(String name) {
        this.name = name;
        this.modules = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollModule(Module module) {
        modules.add(module);
        module.enrollScholar(this);
        System.out.println(name + " has enrolled in " + module.getName());
    }
}

class Instructor {
    private String name;
    private List<Module> modulesTaught;

    public Instructor(String name) {
        this.name = name;
        this.modulesTaught = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignModule(Module module) {
        modulesTaught.add(module);
        module.assignInstructor(this);
        System.out.println(name + " is now teaching " + module.getName());
    }
}
 class Module_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of scholars: ");
        int numScholars = scanner.nextInt();
        scanner.nextLine();
        List<Scholar> scholars = new ArrayList<>();
        for (int i = 0; i < numScholars; i++) {
            System.out.print("Enter name for scholar " + (i + 1) + ": ");
            scholars.add(new Scholar(scanner.nextLine()));
        }

        System.out.print("Enter number of instructors: ");
        int numInstructors = scanner.nextInt();
        scanner.nextLine();
        List<Instructor> instructors = new ArrayList<>();
        for (int i = 0; i < numInstructors; i++) {
            System.out.print("Enter name for instructor " + (i + 1) + ": ");
            instructors.add(new Instructor(scanner.nextLine()));
        }

        System.out.print("Enter number of modules: ");
        int numModules = scanner.nextInt();
        scanner.nextLine();
        List<Module> modules = new ArrayList<>();
        for (int i = 0; i < numModules; i++) {
            System.out.print("Enter name for module " + (i + 1) + ": ");
            modules.add(new Module(scanner.nextLine()));
        }

        if (!scholars.isEmpty() && !instructors.isEmpty() && !modules.isEmpty()) {
            System.out.println("\n--- Assigning Instructors to Modules ---");
            instructors.get(0).assignModule(modules.get(0));
            if (modules.size() > 1 && instructors.size() > 1) {
                instructors.get(1).assignModule(modules.get(1));
            }

            System.out.println("\n--- Scholars Enrolling in Modules ---");
            scholars.get(0).enrollModule(modules.get(0));
            if (scholars.size() > 1) {
                scholars.get(1).enrollModule(modules.get(0));
                if (modules.size() > 1) {
                    scholars.get(1).enrollModule(modules.get(1));
                }
            }

            System.out.println("\n--- Displaying Module Details ---");
            for (Module module : modules) {
                System.out.println("\nModule: " + module.getName());
                System.out.println("Taught by: " + (module.getInstructor() != null ? module.getInstructor().getName() : "Unassigned"));
                System.out.println("Enrolled Scholars:");
                if (module.getScholars().isEmpty()) {
                    System.out.println("  No scholars enrolled.");
                } else {
                    for (Scholar s : module.getScholars()) {
                        System.out.println("  - " + s.getName());
                    }
                }
            }
        } else {
            System.out.println("\nNot enough data to demonstrate the system. Please add more scholars, instructors, and modules.");
        }
        scanner.close();
    }
}