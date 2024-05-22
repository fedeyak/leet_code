package medium_problems.mp_0034_first_and_last_position;

import java.util.Arrays;

public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(Arrays.toString(nums));
    }


    // 0 ms
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[] {-1, -1};
        int start = 0;
        int end = nums.length-1;
        int resultFirst = -1;
        int resultLast = -1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (target <= nums[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        if (nums[start] == target) {
            resultFirst = start;
            end = nums.length;
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (target < nums[mid]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            }
            resultLast = end - 1;
        }
        return new int[]{resultFirst, resultLast};
    }
}
