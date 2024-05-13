package easy_problems.ep_20_valid_parentheses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Stack;

public class ValidParentheses {

    // It's working at last. To solve this problem I had to look up for the hints from other LeetCode users
    public static boolean isValid(String s) {
        Stack<Character> openedParentheses = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);
            if (character == '(' || character == '[' || character == '{') {
                openedParentheses.add(character);
            } else {
                if (openedParentheses.isEmpty()) {
                    return false;
                } else if (openedParentheses.peek() == '(' && character == ')') {
                    openedParentheses.pop();
                } else if (openedParentheses.peek() == '[' && character == ']') {
                    openedParentheses.pop();
                } else if (openedParentheses.peek() == '{' && character == '}') {
                    openedParentheses.pop();
                } else return false;
            }
        }
        return openedParentheses.isEmpty();
    }

    @Test
    public void isValidTest() {
        Assertions.assertTrue(isValid("()"));
        Assertions.assertTrue(isValid("()[]{}"));
        Assertions.assertTrue(isValid("([]{})"));
        Assertions.assertTrue(isValid("([{}])"));

        Assertions.assertFalse(isValid("(])"));
        Assertions.assertFalse(isValid("())"));
        Assertions.assertFalse(isValid("(}"));
        Assertions.assertFalse(isValid(")("));
        Assertions.assertFalse(isValid("([)]"));
    }

    // This method won't work correctly with the data like "([]{})" or "(){}}{"
    public static boolean isValidSecondAttempt(String s) {
        LinkedList<Character> openedParentheses = new LinkedList<>();
        LinkedList<Character> closedParentheses = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);
            if (character == '(' || character == '[' || character == '{') {
                openedParentheses.addFirst(character);
            } else {
                if (character == ')') closedParentheses.addLast('(');
                else if (character == ']') closedParentheses.addLast('[');
                else if (character == '}') closedParentheses.addLast('{');
            }
            if (openedParentheses.size() == closedParentheses.size()) {
                return openedParentheses.toString().equals(closedParentheses.toString());
            }
        }
        return false;
    }


    // This method works perfectly well with all cases, until the case is of a kind "([)]"


    @Test
    public void isValidSecondAttemptTest() {
//        Assertions.assertTrue(isValidSecondAttempt("()"));
//        Assertions.assertTrue(isValidSecondAttempt("()[]{}"));
//        Assertions.assertTrue(isValidSecondAttempt("([]{})"));
//        Assertions.assertTrue(isValidSecondAttempt("([{}])"));
//
//        Assertions.assertFalse(isValidSecondAttempt("())"));
//        Assertions.assertFalse(isValidSecondAttempt("(}"));
//        Assertions.assertFalse(isValidSecondAttempt(")("));
//        Assertions.assertFalse(isValidSecondAttempt("([)]"));
    }

    public static boolean isValidFirstAttempt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '(' -> sum += 1;
                case ')' -> sum -= 1;
                case '[' -> sum += 10;
                case ']' -> sum -= 10;
                case '{' -> sum += 100;
                case '}' -> sum -= 100;
            }
            if (sum < 0) return false;
        }
        return sum == 0;
    }

    @Test
    public void isValidFirstAttempt() {
        Assertions.assertTrue(isValidFirstAttempt("()"));
        Assertions.assertTrue(isValidFirstAttempt("()[]{}"));
        Assertions.assertTrue(isValidFirstAttempt("([]{})"));
        Assertions.assertTrue(isValidFirstAttempt("([{}])"));

        Assertions.assertFalse(isValidFirstAttempt("())"));
        Assertions.assertFalse(isValidFirstAttempt("(}"));
        Assertions.assertFalse(isValidFirstAttempt(")("));
//        Assertions.assertFalse(isValidFirstAttempt("([)]"));
    }

    public static void main(String[] args) {

    }
}
