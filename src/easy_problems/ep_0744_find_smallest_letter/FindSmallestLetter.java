package easy_problems.ep_0744_find_smallest_letter;

import java.util.Arrays;

public class FindSmallestLetter {

    // 0 mc, 44.06 MB
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        int middle = end / 2;

        if (letters[start] > target || letters[end] <= target) {
            return (char) letters[start];
        }
        if (letters[middle] <= target) {
            return nextGreatestLetter(Arrays.copyOfRange(letters, middle+1, end+1), target);
        }
        return nextGreatestLetter(Arrays.copyOfRange(letters, start, middle+1), target);
    }

}
