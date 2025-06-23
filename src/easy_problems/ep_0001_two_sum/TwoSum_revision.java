package easy_problems.ep_0001_two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TwoSum_revision {

    public static void main(String[] args) {
        int[] nums = new int[] {2,7,11,15};
        int target = 22;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int dif = target - nums[i];
            if (map.containsKey(dif)) {
                return new int[] {map.get(dif), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }
}
