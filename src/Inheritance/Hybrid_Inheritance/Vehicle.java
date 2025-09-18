package Inheritance.Hybrid_Inheritance;
import java.util.Scanner;
class Vehicle {
    String model;
    int max_Speed;
    Vehicle(String model, int max_Speed) {
        this.model = model;
        this.max_Speed = max_Speed;
    }

    void display_Details() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + max_Speed + " km/h");
    }
}

interface Refuelable {
    void refuel();
}

class Electric_Vehicle extends Vehicle {
    int battery_Capacity;

    Electric_Vehicle(String model, int max_Speed, int battery_Capacity) {
        super(model, max_Speed);
        this.battery_Capacity = battery_Capacity;
    }

    void charge() {
        System.out.println("Role: Electric Vehicle");
        display_Details();
        System.out.println("Battery Capacity: " + battery_Capacity + " kWh");
        System.out.println("Charging the electric vehicle...");
    }
}

class Petrol_Vehicle extends Vehicle implements Refuelable {
    int fuel_Capacity;

    Petrol_Vehicle(String model, int max_Speed, int fuel_Capacity) {
        super(model, max_Speed);
        this.fuel_Capacity = fuel_Capacity;
    }

    public void refuel() {
        System.out.println("Role: Petrol Vehicle");
        display_Details();
        System.out.println("Fuel Capacity: " + fuel_Capacity + " liters");
        System.out.println("Refueling the petrol vehicle...");
    }
}
class Vehicle_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Vehicle Type: 1. Electric Vehicle 2. Petrol Vehicle");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Model: ");
        String model = sc.nextLine();
        System.out.print("Enter Max Speed: ");
        int max_Speed = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Battery Capacity (kWh): ");
                int battery = sc.nextInt();
                Electric_Vehicle ev = new Electric_Vehicle(model, max_Speed, battery);
                ev.charge();
                break;
            case 2:
                System.out.print("Enter Fuel Capacity (liters): ");
                int fuel = sc.nextInt();
                Petrol_Vehicle pv = new Petrol_Vehicle(model, max_Speed, fuel);
                pv.refuel();
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}

