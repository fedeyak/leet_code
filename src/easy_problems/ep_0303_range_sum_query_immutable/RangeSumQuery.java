package easy_problems.ep_0303_range_sum_query_immutable;

import java.util.Arrays;

public class RangeSumQuery {
    private static int[] array = {-2, 0, 3, -5, 2, -1};
//private static int[] array = {1,1,1,1,1,1,1,1,1,1};

    public static void main(String[] args) {
        System.out.println(sumRange(0, 2));
        System.out.println(sumRange(2, 5));
        System.out.println(sumRange(0, 5));
    }

    public static int sumRange(int left, int right) {
        int[] prefixArray = new int[array.length + 1];
        prefixArray[0] = 0;
        for (int i = 1; i < prefixArray.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + array[i - 1];
        }
        return prefixArray[right + 1] - prefixArray[left];
    }
}
