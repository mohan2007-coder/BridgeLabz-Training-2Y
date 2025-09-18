package Inheritance.Assisted_Problems;
import java.util.Scanner;
class Vehicle {
    int max_Speed;
    String fuel_Type;
    Vehicle(int maxSpeed, String fuelType) {
        this.max_Speed = maxSpeed;
        this.fuel_Type = fuelType;
    }
    void display_Info() {
        System.out.println("Max Speed: " + max_Speed + " km/h, Fuel Type: " + fuel_Type);
    }
}
class Car extends Vehicle {
    int seat_Capacity;
    Car(int max_Speed, String fuel_Type, int seat_Capacity) {
        super(max_Speed, fuel_Type);
        this.seat_Capacity = seat_Capacity;
    }
    void display_Info() {
        super.display_Info();
        System.out.println("Seat Capacity: " + seat_Capacity);
    }
}
class Truck extends Vehicle {
    int load_Capacity;
    Truck(int max_Speed, String fuel_Type, int load_Capacity) {
        super(max_Speed, fuel_Type);
        this.load_Capacity = load_Capacity;
    }
    void display_Info() {
        super.display_Info();
        System.out.println("Load Capacity: " + load_Capacity + " tons");
    }
}
class Motorcycle extends Vehicle {
    String type;
    Motorcycle(int max_Speed, String fuel_Type, String type) {
        super(max_Speed, fuel_Type);
        this.type = type;
    }
    void display_Info() {
        super.display_Info();
        System.out.println("Motorcycle Type: " + type);
    }
}
class Vehicle_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();
        sc.nextLine();
        Vehicle[] vehicles = new Vehicle[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter vehicle type (car/truck/motorcycle): ");
            String type = sc.nextLine().toLowerCase();
            System.out.print("Enter max speed: ");
            int maxSpeed = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter fuel type: ");
            String fuelType = sc.nextLine();
            if (type.equals("car"))
            {
                System.out.print("Enter seat capacity: ");
                int seat = sc.nextInt();
                sc.nextLine();
                vehicles[i] = new Car(maxSpeed, fuelType, seat);
            }
            else if (type.equals("truck"))
            {
                System.out.print("Enter load capacity (tons): ");
                int load = sc.nextInt();
                sc.nextLine();
                vehicles[i] = new Truck(maxSpeed, fuelType, load);
            }
            else if (type.equals("motorcycle"))
            {
                System.out.print("Enter motorcycle type (sports/cruiser/etc.): ");
                String mType = sc.nextLine();
                vehicles[i] = new Motorcycle(maxSpeed, fuelType, mType);
            }
            else
            {
                vehicles[i] = new Vehicle(maxSpeed, fuelType);
            }
        }
        System.out.println("\nVehicle Details:");
        for (Vehicle v : vehicles) {
            v.display_Info();
            System.out.println();
        }
        sc.close();
    }
}
