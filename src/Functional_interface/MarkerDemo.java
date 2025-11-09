package Functional_interface;

interface SensitiveData { }

class UserData implements SensitiveData {
    String name = "Akshat";
    String password = "12345";
}

public class MarkerDemo {
    public static void main(String[] args) {
        UserData user = new UserData();
        if (user instanceof SensitiveData)
            System.out.println("Encrypting sensitive user data...");
    }
}
