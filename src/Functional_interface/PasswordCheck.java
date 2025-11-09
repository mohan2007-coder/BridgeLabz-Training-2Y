package Functional_interface;

interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*");
    }
}

public class PasswordCheck {
    public static void main(String[] args) {
        String pass = "Akshat123";
        System.out.println(SecurityUtils.isStrongPassword(pass)
                ? "Strong Password"
                : "Weak Password ");
    }
}
