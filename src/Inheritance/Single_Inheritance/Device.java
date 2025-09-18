package Inheritance.Single_Inheritance;
import java.util.Scanner;
class Device {
    String device_Id;
    String status;
    Device(String device_Id, String status) {
        this.device_Id = device_Id;
        this.status = status;
    }
    void display_Status() {
        System.out.println("Device ID: " + device_Id + ", Status: " + status);
    }
}
class Thermostat extends Device {
    double temperature_Setting;
    Thermostat(String device_Id, String status, double temperature_Setting) {
        super(device_Id, status);
        this.temperature_Setting = temperature_Setting;
    }
    void display_status() {
        super.display_Status();
        System.out.println("Temperature Setting: " + temperature_Setting + "°C");
    }
}
class Smart_Home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter device ID: ");
        String id = sc.nextLine();
        System.out.print("Enter status (on/off): ");
        String status = sc.nextLine();
        System.out.print("Enter temperature setting: ");
        double temp = sc.nextDouble();
        Thermostat thermostat = new Thermostat(id, status, temp);
        System.out.println("\nDevice Details:");
        thermostat.display_Status();
        sc.close();
    }
}
