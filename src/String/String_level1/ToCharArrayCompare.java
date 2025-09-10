package String.String_level1;

import java.util.Scanner;

public class ToCharArrayCompare {
    public static char[] getChars(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        char[] userChars = getChars(text);
        char[] builtInChars = text.toCharArray();

        System.out.println("Are both character arrays equal? " + compareCharArrays(userChars, builtInChars));
    }
}

