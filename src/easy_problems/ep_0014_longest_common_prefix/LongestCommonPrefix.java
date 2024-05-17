package easy_problems.ep_0014_longest_common_prefix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

//Runtime 1 ms Beats 75.51% of users with Java
// This method goes through all members of the array.
// This is excessive. After the array is sorted, it would be enough just to compare the first and the last array members.
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        Arrays.sort(strs);

        String string = strs[0];

        if (string.length() == 0) return "";

        StringBuilder builder = new StringBuilder("");

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != ch) {
                    return builder.toString();
                }
            }
            builder.append(ch);
        }
        return builder.toString();
    }

    @Test
    public void longestCommonPrefixTest() {
        Assertions.assertEquals("fl", longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        Assertions.assertEquals("", longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        Assertions.assertEquals("", longestCommonPrefix(new String[]{""}));
        Assertions.assertEquals("a", longestCommonPrefix(new String[]{"a"}));
        Assertions.assertEquals("a", longestCommonPrefix(new String[]{"a", "ab"}));
        Assertions.assertEquals("ab", longestCommonPrefix(new String[]{"abc", "ab"}));
    }
}
