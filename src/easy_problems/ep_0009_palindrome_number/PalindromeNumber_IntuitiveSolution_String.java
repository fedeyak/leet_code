package easy_problems.ep_0009_palindrome_number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumber_IntuitiveSolution_String {

    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        int lastLetter = number.length()-1;
        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) != number.charAt(lastLetter)) {
                return false;
            }
            lastLetter--;
        }
        return true;
    }
    @Test
    public void Test() {
        Assertions.assertTrue(isPalindrome(11111));
        Assertions.assertTrue(isPalindrome(0));
        Assertions.assertTrue(isPalindrome(11));
        Assertions.assertTrue(isPalindrome(111));
        Assertions.assertTrue(isPalindrome(55255));
        Assertions.assertFalse(isPalindrome(10));
        Assertions.assertFalse(isPalindrome(1010));
    }


}
