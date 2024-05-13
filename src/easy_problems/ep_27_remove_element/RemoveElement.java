package easy_problems.ep_27_remove_element;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = new int[] {2, 2, 2, 3};
        System.out.println(removeElement(nums, 2));
        System.out.println(Arrays.toString(nums));
    }

    //Runtime 0 ms Beats 100% of users with Java
    //However the LeetCode database has a much more elegant solution [https://goo.su/G7jWQBR]
    public static int removeElement(int[] nums, int val) {
        int counter = 0;
        int temp;
        int last = nums.length - 1;
        for (;counter < (last + 1); counter++) {
            while (nums[last] == val) {
                if (last == 0) return 0;
                last--;
            }
            if (nums[counter] == val) {
                temp = nums[last];
                nums[last--] = nums[counter];
                nums[counter] = temp;
            }
        }
        return counter;
    }
}
