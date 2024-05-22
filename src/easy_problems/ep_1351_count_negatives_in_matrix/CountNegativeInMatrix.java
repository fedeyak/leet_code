package easy_problems.ep_1351_count_negatives_in_matrix;

import java.util.Arrays;

public class CountNegativeInMatrix {

    // 0 ms
    public int countNegatives(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++){
            sum += amountOfNegatives(grid[i]);
        }
        return sum;
    }

    private int amountOfNegatives(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int target = 0;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        if (nums[start] < 0) {
            return nums.length - start;
        }
        return 0;
    }
}
