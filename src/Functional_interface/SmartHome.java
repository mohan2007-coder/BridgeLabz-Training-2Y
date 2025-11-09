package Functional_interface;

// SmartDevice.java
interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() { System.out.println("Light turned ON."); }
    public void turnOff() { System.out.println("Light turned OFF."); }
}

class AirConditioner implements SmartDevice {
    public void turnOn() { System.out.println("AC started cooling."); }
    public void turnOff() { System.out.println("AC stopped."); }
}

class Television implements SmartDevice {
    public void turnOn() { System.out.println("TV is now ON."); }
    public void turnOff() { System.out.println("TV is now OFF."); }
}


public class SmartHome {
    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice ac = new AirConditioner();
        SmartDevice tv = new Television();

        light.turnOn(); ac.turnOn(); tv.turnOn();
        light.turnOff(); ac.turnOff(); tv.turnOff();
    }
}
