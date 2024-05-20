package easy_problems.ep_744_find_smallest_letter;

public class FindSmallestLetter {

    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        System.out.println(nextGreatestLetter(letters, 'c'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        if (letters[0] > target) return letters[0];
        int start = 0;
        int end = letters.length;
        int middle = end / 2;

        while (start < end) {
            if (letters[middle] > target) {
                end = middle;
                middle = middle / 2;
            } else if (letters[middle] < target) {
                start = middle + 1;
                middle = end + (middle - end) / 2;
            } else return (char) (letters[middle + 1]);
        }
        return letters[end];
    }

}
