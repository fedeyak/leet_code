package easy_problems.ep_0035_search_insert_position;

import java.util.Arrays;

public class SearchInsertPosition {

    // Didn't figure it out. Was trying to mess with the middle. Had to look up for the solution.
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        int middle = end / 2;

        while (start < end) {
            if (nums[middle] > target) {
                end = middle;
                middle = middle / 2;
            } else if (nums[middle] < target) {
                start = middle + 1;
                middle =  end + (middle - end) / 2;
            } else return middle;
        }
        return start;
    }
}
