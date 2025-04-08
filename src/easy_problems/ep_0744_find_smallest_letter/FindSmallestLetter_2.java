package easy_problems.ep_0744_find_smallest_letter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

public class FindSmallestLetter_2 {

    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        if (target >= letters[high] || target < letters[low]) {
            return  letters[0];
        }

        while (low <= high) {
            int middle = low + ((high - low) / 2);
            int middleValue = letters[middle];
            if (target == middleValue) {
                return letters[middle + 1];
            }
            if (target < middleValue) {
                high = middle - 1;
            }
            if (middleValue < target) {
                low = middle + 1;
            }
        }
        return 0;
    }

    @Test
    @DisplayName("return first char if target is lower than first")
    public void targetIsLowerThanFirst() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        Assertions.assertEquals(nextGreatestLetter(letters, target), 'c');
    }

    @Test
    @DisplayName("return next char after the target")
    public void nextAfterTarget() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        Assertions.assertEquals(nextGreatestLetter(letters, target), 'f');
    }

    @Test
    @DisplayName("return first char if target is not in the array")
    public void targetIsAbsent() {
        char[] letters = {'x', 'x', 'y', 'y'};
        char target = 'z';
        Assertions.assertEquals(nextGreatestLetter(letters, target), 'x');
    }

    @Test
    @DisplayName("return first char if target is the last in the array")
    public void targetIsLast() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'j';
        Assertions.assertEquals(nextGreatestLetter(letters, target), 'c');
    }
}


