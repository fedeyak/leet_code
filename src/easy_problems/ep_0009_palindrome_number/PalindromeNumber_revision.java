package easy_problems.ep_0009_palindrome_number;

import java.util.stream.IntStream;

public class PalindromeNumber_revision {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        return str.contentEquals(new StringBuilder(str).reverse());


//        return IntStream.range(0, str.length() / 2)
//                .allMatch(i -> str.charAt(i) == str.charAt(str.length() - 1 - i));

//        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
//            if (str.charAt(i) != str.charAt(j)) {
//                return false;
//            }
//        }
//        return true;
        
//        if (x < 0) return false;
//        int xCopy = x;
//        int xRreverced= 0;
//
//        while (xCopy > 0) {
//            xRreverced *= 10;
//            xRreverced += (xCopy % 10);
//            xCopy /= 10;
//        }
//
//        return x == xRreverced;
    }

}
