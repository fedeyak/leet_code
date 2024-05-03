package easy_problems.ep_0009_palindrome_number;

import static java.lang.Math.log;
import static java.lang.Math.pow;

public class PalindromeNumber_IntuitiveSolution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(925));
    }

    public static boolean isPalindrome(int x) {

        int first = ((int)(pow(10,(int)log(x))));
        int last = x % 10;

        System.out.println(first);

        System.out.println(last);

        return false;
    }


}
