package String.String_level2;

import java.util.Scanner;

public class TextSplitter {

    public static int findStringLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return length;
    }

    public static String[] customSplit(String text) {
        int wordCount = 0;
        boolean inWord = false;
        int length = findStringLength(text);

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        if (wordCount == 0) {
            return new String[0];
        }

        int[] spaceIndexes = new int[wordCount + 2];
        String[] words = new String[wordCount];

        int spaceIndex = 0;
        spaceIndexes[spaceIndex++] = -1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex++] = i;
            }
        }

        spaceIndexes[spaceIndex] = length;

        int wordIndex = 0;
        for (int i = 0; i < spaceIndex; i++) {
            int start = spaceIndexes[i] + 1;
            int end = spaceIndexes[i + 1];

            if (start < end) {
                StringBuilder wordBuilder = new StringBuilder();
                for (int j = start; j < end; j++) {
                    wordBuilder.append(text.charAt(j));
                }
                words[wordIndex++] = wordBuilder.toString();
            }
        }

        return words;
    }

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1 == null && arr2 == null) {
            return true;
        }

        if (arr1 == null || arr2 == null) {
            return false;
        }

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == null && arr2[i] == null) {
                continue;
            }
            if (arr1[i] == null || arr2[i] == null) {
                return false;
            }
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void displayArray(String[] array, String title) {
        System.out.println(title + ":");
        if (array == null || array.length == 0) {
            System.out.println("  [Empty array]");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("  [" + i + "]: '" + array[i] + "'");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Text Splitter Program");
        System.out.println("=====================");
        System.out.print("Enter a text to split: ");
        String inputText = scanner.nextLine();

        String[] customResult = customSplit(inputText);
        String[] builtInResult = inputText.split("\\s+");

        boolean areEqual = compareStringArrays(customResult, builtInResult);

        System.out.println("\nResults:");
        System.out.println("========");

        displayArray(customResult, "Custom Split Result");
        System.out.println();
        displayArray(builtInResult, "Built-in Split Result");
        System.out.println();

        System.out.println("Comparison Result: " + (areEqual ? "MATCH ✓" : "DO NOT MATCH ✗"));

        scanner.close();
    }
}