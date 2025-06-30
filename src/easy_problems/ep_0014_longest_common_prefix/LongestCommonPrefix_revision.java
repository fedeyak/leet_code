package easy_problems.ep_0014_longest_common_prefix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix_revision {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String firstString = strs[0];
        String lastString = strs[strs.length - 1];
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < firstString.length(); i++) {
            char currentChar = firstString.charAt(i);
            if (currentChar != lastString.charAt(i)) {
                break;
            }
            prefix.append(currentChar);
        }
        return prefix.toString();


//    Объявляем самое короткое слово префиксом.
//    Начало каждого слова длинной в префикс сравниваем с префиксом.
//    Если они не совпадают - уменьшаем префикс и часть слова на один символ.

//        Arrays.sort(strs, Comparator.comparing(String::length));
//        StringBuilder prefix = new StringBuilder(strs[0]);
//        int prefixLength = prefix.length();
//        for (String string : strs) {
//            StringBuilder current = new StringBuilder(string.substring(0, prefixLength));
//            while (!(prefix.compareTo(current) == 0)) {
//                prefixLength--;
//                prefix = prefix.deleteCharAt(prefixLength);
//                current = current.deleteCharAt(prefixLength);
//            }
//            if ("".contentEquals(prefix)){
//                break;
//            }
//        }
//        return prefix.toString();


//      Проходим по каждой букве самого короткого слова.
//      Добавляем текущую букву к Префиксу, если все слова в массиве содержат данную буквы в том же месте слова

//        Arrays.sort(strs);
//        StringBuilder prefix = new StringBuilder();
//        int length = strs[0].length();
//
//        for (int i = 0; i < length; i++) {
//            char currentLetter = strs[0].charAt(i);
//            for (String str : strs) {
//                if (currentLetter != str.charAt(i)) {
//                    return prefix.toString();
//                }
//            }
//            prefix.append(currentLetter);
//        }
//        return prefix.toString();


//        Создаём слово "эталон" (первое слово из списка) и сравнивем его побуквенно со всеми остальными словами из списка
//        Когда буквы из эталона и сравниваемого слова не совпадают, эталон обновляестя (сокращается до момента, пока буквы совпадали)

//        StringBuilder sample = new StringBuilder(strs[0]);
//        for (int i = 1; i < strs.length; i++) {
//            String firstString = sample.toString();
//            String secondString = strs[i];
//            sample = new StringBuilder();
//            int shortest = Math.min(firstString.length(), secondString.length());
//            for (int j = 0; j < shortest; j++) {
//                if (firstString.charAt(j) != secondString.charAt(j)) {
//                    break;
//                }
//                sample.append(firstString.charAt(j));
//            }
//            if (sample.isEmpty()) {
//                break;
//            }
//        }
//        return sample.toString();
    }
//    Возвращаем остаток префикса.


    @Test
    public void longestCommonPrefixTest() {
        Assertions.assertEquals("", longestCommonPrefix(new String[]{""}));
        Assertions.assertEquals("", longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        Assertions.assertEquals("fl", longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        Assertions.assertEquals("a", longestCommonPrefix(new String[]{"a"}));
        Assertions.assertEquals("a", longestCommonPrefix(new String[]{"a", "ab"}));
        Assertions.assertEquals("ab", longestCommonPrefix(new String[]{"abc", "ab"}));
    }

}
