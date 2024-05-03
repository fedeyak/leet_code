package easy_problems.ep_0001_two_sum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_BestPracticeSolution {
    public static void main(String[] args) {
        int[] nums = new int[] {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = result.get(nums[i]);
            if (index != null) {
                return new int[] {index, i};
            }
            result.put((target - nums[i]), i);
        }
        return null;
    }
}