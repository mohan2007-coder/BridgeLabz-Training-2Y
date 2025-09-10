package String.String_level2;

import java.util.Scanner;

public class WordSplitter {

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

    public static String[][] getWordsWithLengths(String[] words) {
        if (words == null || words.length == 0) {
            return new String[0][2];
        }

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findStringLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Word Splitter with Lengths");
        System.out.println("==========================");
        System.out.print("Enter a text to split: ");
        String inputText = scanner.nextLine();

        String[] words = customSplit(inputText);
        String[][] wordsWithLengths = getWordsWithLengths(words);

        System.out.println("\nResults:");
        System.out.println("========");
        System.out.println("Word\t\tLength");
        System.out.println("----\t\t------");

        for (int i = 0; i < wordsWithLengths.length; i++) {
            String word = wordsWithLengths[i][0];
            int length = Integer.parseInt(wordsWithLengths[i][1]);
            System.out.println(word + "\t\t" + length);
        }

        scanner.close();
    }
}
