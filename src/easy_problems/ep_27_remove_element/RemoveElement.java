package easy_problems.ep_27_remove_element;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = new int[] {4, 5};
        System.out.println(removeElement(nums, 4));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        int temp;
        int removals = 0;
        int last = nums.length - 1;
        for (int i = 0; i < last + 1; i++) {
            while (nums[last] == val) {
                if (last == 0) return 0;
                last--;
                removals++;
            }
            if (nums[i] == val) {
                temp = nums[last];
                nums[last--] = nums[i];
                nums[i] = temp;
                removals++;
            }
        }
        return nums.length - removals;
    }
}
