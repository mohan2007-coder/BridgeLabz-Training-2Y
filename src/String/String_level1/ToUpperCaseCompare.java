package String.String_level1;
import java.util.Scanner;

public class ToUpperCaseCompare {
    public static String toUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
            }
            result += c;
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String userUpper = toUpper(text);
        String builtInUpper = text.toUpperCase();

        System.out.println("User-defined: " + userUpper);
        System.out.println("Built-in: " + builtInUpper);
        System.out.println("Are both equal? " + compareStrings(userUpper, builtInUpper));
    }
}

