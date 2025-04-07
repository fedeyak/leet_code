package easy_problems.ep_0035_search_insert_position;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SearchInsertPosition_2 {
    int[] nums = {1, 2, 3, 5, 6};


    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length;

        while (low < high) {
            int middle = low + ((high - low) / 2);
            int middleValue = nums[middle];
            if (target <= middleValue) {
                high = middle;
            }
            if (middleValue < target) {
                low = middle + 1;
            }
        }
        return low;
    }


    @Test
    @DisplayName("First element returns correctly")
    public void firstElement() {
        assertEquals(searchInsert(nums, 1), 0);
    }

    @Test
    @DisplayName("Last element returns correctly")
    public void lastElement() {
        assertEquals(searchInsert(nums, 6), 4);
    }


    @Test
    @DisplayName("Middle element returns correctly")
    public void middleElement() {
        assertEquals(searchInsert(nums, 3), 2);
    }

    @Test
    @DisplayName("If absent in the middle returns its would be position")
    public void absentMiddleElement() {
        assertEquals(searchInsert(nums, 4), 3);
    }

    @Test
    @DisplayName("If less then lowest returns 0")
    public void lessThenLowest() {
        assertEquals(searchInsert(nums, -9), 0);
    }

    @Test
    @DisplayName("If bigger then highest returns last")
    public void biggerThenHighest() {
        assertEquals(searchInsert(nums, 10), 5);
    }
}
