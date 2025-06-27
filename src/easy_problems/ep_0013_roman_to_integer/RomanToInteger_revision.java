package easy_problems.ep_0013_roman_to_integer;

import java.util.Arrays;

public class RomanToInteger_revision {

    public static void main(String[] args) {
        System.out.println(romanToInt("DCXXI"));

    }

    public static int romanToInt(String s) {
        int result1 = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'M') {
                result1 += 1000;
            } else if (chars[i] == 'C' && chars[i + 1] == 'M') {
                result1 += 900;
            }


        }

        s = s.replaceAll("CM", "900;");
        s = s.replaceAll("CD", "400;");
        s = s.replaceAll("XC", "90;");
        s = s.replaceAll("XL", "40;");
        s = s.replaceAll("IX", "9;");
        s = s.replaceAll("IV", "4;");

        s = s.replaceAll("M", "1000;");
        s = s.replaceAll("D", "500;");
        s = s.replaceAll("C", "100;");
        s = s.replaceAll("L", "50;");
        s = s.replaceAll("X", "10;");
        s = s.replaceAll("V", "5;");
        s = s.replaceAll("I", "1;");

        String[] strings = s.split(";");

        int result = 0;

        for (int i = 0; i < strings.length; i++) {
            result += Integer.parseInt(strings[i]);
        }

        return result;
    }
}
