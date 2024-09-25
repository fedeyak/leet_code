package yandex;

import java.util.Arrays;
import java.util.Scanner;

public class TextFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        formatter(s);
        System.out.println(formatter(s));
        scanner.close();
    }

    public static String formatter(String initialString) {
        String processedString  = processString(initialString);

        int WORD_MULTIPLICATOR = 3;
        int stringLength = longestWordLength(processedString) * WORD_MULTIPLICATOR;

        String splittedString = splitString(processedString, stringLength);
        return splittedString;
    }

    private static String splitString(String string, int stringLength) {
        String[] words = string.split(" ");
        StringBuilder stringBuilder = new StringBuilder(words[0]);
        int lineLength = words[0].length();

        for (int i = 1; i < words.length; i++) {
            if (lineLength + words[i].length() + 1 > stringLength) {
                stringBuilder.append("\n").append(words[i]);
                lineLength = words[i].length();
            } else {
                stringBuilder.append(" ").append(words[i]);
                lineLength += words[i].length() + 1;
            }
        }

        return stringBuilder.toString();
    }

    private static int longestWordLength(String string) {
        return  Arrays.stream(string.split(" "))
                .mapToInt(String::length)
                .max()
                .orElse(0);
    }

    private static String processString(String string) {
        string = string.replaceAll(" ,", ",");
        string = string.replaceAll(",(?!\\s)", ", ");
        return string;
    }
}
