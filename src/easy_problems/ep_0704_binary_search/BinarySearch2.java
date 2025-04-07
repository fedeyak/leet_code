package easy_problems.ep_0704_binary_search;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BinarySearch2 {

    @Test
    public void checker() {
        int[] nums = {1, 3, 5, 8};
        assertEquals(search(nums, 1), 0);
        assertEquals(search(nums, 5), 2);
        assertEquals(search(nums, 8), 3);
        assertEquals(search(nums, -2), -1);
        assertEquals(search(nums, 2), -1);
        assertEquals(search(nums, 7), -1);
        assertEquals(search(nums, 9), -1);
    }

    private static int search(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            long midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -1;
//        return -(low + 1);  // key not found.
    }

//    private static int search(int[] nums, int target) {
//            int low = 0;
//            int high = nums.length-1;
//            while (low <= high) {
////                int mid = low + ((low - (high + 1)) / 2);
//            int mid = low + ((high - low ) / 2);
//                if (target < nums[mid]) {
//                    high = mid - 1;
//                } else {
//                    low = mid;
//                }
//            }
//            return nums[low] == target ? low : -1;
//    }





    private static int search0(int[] nums, int target) {
        int low = 0;
        int high = nums.length;

        while (low < high) {
            int middle = low + ((high - low) / 2);
            if (target == nums[middle]) {
                return middle;
            }
            if (target < nums[middle]) {
                high = middle;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }
}
