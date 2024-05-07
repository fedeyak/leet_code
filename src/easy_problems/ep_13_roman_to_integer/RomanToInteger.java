package easy_problems.ep_13_roman_to_integer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));

    }
    public static int romanToInt(String s) {
        int length = s.length();
        int result = 0;

        for (int i = 0 ; i < length; i++) {
            char ch = s.charAt(i);

            if (i < length - 1) {
                if (ch == 'I' && s.charAt(i + 1) == 'V') {result += 4; i++; continue;}
                if (ch == 'I' && s.charAt(i + 1) == 'X') {result += 9; i++; continue;}
                if (ch == 'X' && s.charAt(i + 1) == 'L') {result += 40; i++; continue;}
                if (ch == 'X' && s.charAt(i + 1) == 'C') {result += 90; i++; continue;}
                if (ch == 'C' && s.charAt(i + 1) == 'D') {result += 400; i++; continue;}
                if (ch == 'C' && s.charAt(i + 1) == 'M') {result += 900; i++; continue;}
            }
            if (ch == 'I') {result += 1; continue;}
            if (ch == 'V') {result += 5; continue;}
            if (ch == 'X') {result += 10; continue;}
            if (ch == 'L') {result += 50; continue;}
            if (ch == 'C') {result += 100; continue;}
            if (ch == 'D') {result += 500; continue;}
            if (ch == 'M') {result += 1000; continue;}
        }
        return result;
    }

    @Test
    public void romanToIntTest() {
        Assertions.assertEquals(3, romanToInt("III"));
        Assertions.assertEquals(58, romanToInt("LVIII"));
        Assertions.assertEquals(1994, romanToInt("MCMXCIV"));
    }
}
