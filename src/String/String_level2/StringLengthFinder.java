package String.String_level2;
import java.util.Scanner;

public class StringLengthFinder {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        System.out.println("Length using user-defined method: " + findLength(input));
        System.out.println("Length using built-in method: " + input.length());
    }
}
