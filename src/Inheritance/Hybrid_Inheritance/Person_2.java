package Inheritance.Hybrid_Inheritance;
import java.util.Scanner;
class Person_2 {
    String name;
    int id;
    Person_2(String name, int id) {
        this.name = name;
        this.id = id;
    }
    void display_Details() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

interface Worker {
    void perform_Duties();
}

class Chef extends Person_2 implements Worker {
    String specialty;
    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }
    public void perform_Duties() {
        System.out.println("Role: Chef");
        display_Details();
        System.out.println("Specialty: " + specialty);
        System.out.println("Duties: Cooking dishes and managing the kitchen");
    }
}

class Waiter extends Person_2 implements Worker {
    String section;
    Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }
    public void perform_Duties() {
        System.out.println("Role: Waiter");
        display_Details();
        System.out.println("Section: " + section);
        System.out.println("Duties: Serving food and attending customers");
    }
}
 class Restaurant_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Role: 1. Chef 2. Waiter");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Specialty: ");
                String specialty = sc.nextLine();
                Chef chef = new Chef(name, id, specialty);
                chef.perform_Duties();
                break;
            case 2:
                System.out.print("Enter Section: ");
                String section = sc.nextLine();
                Waiter waiter = new Waiter(name, id, section);
                waiter.perform_Duties();
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}
