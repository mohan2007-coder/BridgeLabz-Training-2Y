package Javaclass.Lavel_2;
import java.util.Scanner;
public class Palindrome_Checker {
    private String text;
    public Palindrome_Checker(String text) {
        this.text = text;
    }
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase();
        String reversedText = new StringBuilder(cleanedText).reverse().toString();
        return cleanedText.equals(reversedText);
    }
    public void displayResult() {
        if (isPalindrome())
        {
            System.out.println("'" + text + "' is a palindrome.");
        }
        else
        {
            System.out.println("'" + text + "' is not a palindrome.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check for palindrome: ");
        String userInput = scanner.nextLine();
        Palindrome_Checker checker = new Palindrome_Checker(userInput);
        checker.displayResult();
        scanner.close();
    }
}