package easy_problems.ep_0009_palindrome_number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.Math.*;

public class PalindromeNumber_IntuitiveSolution {



    // Well... the solution is correct, but clumsy. A much better solution could be found at
    // https://leetcode.com/problems/palindrome-number/solutions/3651712/2-method-s-c-java-python-beginner-friendly/
    public static boolean isPalindrome(int x) {
        int xLength = (int) log10(x) + 1;
        int xFirstHalf = x;
        int xSecondHalf = 0;

        for (int i = 0; i < xLength / 2 ; i++) {
            xSecondHalf += xFirstHalf % 10;
            xSecondHalf *= 10;
            xFirstHalf /= 10;
        }

        if (xLength % 2 == 1) {
            xFirstHalf /= 10;
        }
        xFirstHalf *= 10;

        return xFirstHalf == xSecondHalf;
    }

    // It was my first attempt.
    // This method doesn't work correctly if the number is not a palindrome and among the compared digits the first one is zero.
    // For example if number is 10021, when the first and the last digits are removed, the remaining number is not 002, but just 2
    public static boolean isPalindromeRecursive(int x) {
        if (x < 0) {
            return false;
        }

        if (x / 10 == 0) {
            return true;
        }

        int capacity = (int) pow(10, (int) log10(x));
        int first = x / capacity;
        int last = x % 10;

        if (first != last) {
            return false;
        }
        return isPalindromeRecursive(x % capacity / 10);
    }

    @Test
    public void TestIsPalindrome() {
        Assertions.assertTrue(isPalindrome(11111));
        Assertions.assertTrue(isPalindrome(0));
        Assertions.assertTrue(isPalindrome(11));
        Assertions.assertTrue(isPalindrome(111));
        Assertions.assertTrue(isPalindrome(55255));
        Assertions.assertFalse(isPalindrome(10));
        Assertions.assertFalse(isPalindrome(1010));
        Assertions.assertFalse(isPalindrome(1000021));   // there will be red!
    }

    @Test
    public void TestIsPalindromeRecursive() {
        Assertions.assertTrue(isPalindromeRecursive(11111));
        Assertions.assertTrue(isPalindromeRecursive(0));
        Assertions.assertTrue(isPalindromeRecursive(11));
        Assertions.assertTrue(isPalindromeRecursive(111));
        Assertions.assertTrue(isPalindromeRecursive(55255));
        Assertions.assertFalse(isPalindromeRecursive(10));
        Assertions.assertFalse(isPalindromeRecursive(1010));
//        Assertions.assertFalse(isPalindromeRecurcive(1000021));   // there will be red!
    }


}
