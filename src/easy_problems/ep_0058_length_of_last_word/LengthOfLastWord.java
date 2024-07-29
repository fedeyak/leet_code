package easy_problems.ep_0058_length_of_last_word;

import java.util.Arrays;

public class LengthOfLastWord {

    public static void main(String[] args) {
//        String string = "Hello World";
        String string = "   fly me   to    moon  ";
        System.out.println(lengthOfLastWord(string));
    }

//    2 ms
    public static String lengthOfLastWord(String s) {
        return Arrays.stream(s.trim().split(" "))
                .reduce((first, second) -> first)
                .orElse("");
    }


//    0 ms
//    public static int lengthOfLastWord(String s) {
//        s = s.trim();
//        int counter = 0;
//        for (int i = s.length() - 1; i >= 0; i--){
//            if (s.charAt(i) == ' ') break;
//            counter++;
//        }
//        return counter;
//    }

//    1 ms
//    public static int lengthOfLastWord(String string) {
//        string = string.trim();
//        String[] strings = string.split(" ");
//        return strings[strings.length - 1].length();
//    }
}
