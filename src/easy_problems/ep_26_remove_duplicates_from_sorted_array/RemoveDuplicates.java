package easy_problems.ep_26_remove_duplicates_from_sorted_array;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    //Runtime 1 ms Beats 73.5% of users with Java
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[k] == nums[i]) {
                continue;
            }
            nums[++k] = nums[i];
        }
        System.out.println(Arrays.toString(nums));
        return k++;
    }
}
