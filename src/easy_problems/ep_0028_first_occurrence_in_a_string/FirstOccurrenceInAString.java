package easy_problems.ep_0028_first_occurrence_in_a_string;

public class FirstOccurrenceInAString {

    //Runtime 0 ms Beats 100% of users with Java
    public int strStrRecursion(String haystack, String needle) {
        if (!haystack.contains(needle)) return -1;
        if (needle.equals(haystack.substring(0, needle.length()))) return 0;
        return 1 + strStrRecursion(haystack.substring(1), needle);
    }

    //Runtime 0 ms Beats 100% of users with Java
    public int strStrIntuitive(String haystack, String needle) {
        for (int i = 0; i < (haystack.length() - (needle.length() - 1)); i++) {
            if (haystack. substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    //Runtime 0 ms Beats 100% of users with Java
    // However, this solution is a bit dull
    public int strStrUsingStringMethods(String haystack, String needle) {
        if (!haystack.contains(needle)) {
            return -1;
        }
        return haystack.indexOf(needle);
    }
}
