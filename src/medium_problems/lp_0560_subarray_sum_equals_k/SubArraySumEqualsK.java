package medium_problems.lp_0560_subarray_sum_equals_k;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubArraySumEqualsK {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println(subArraySum(nums, k));

    }


    public static int subArraySum(int[] nums, int k) {

        Map<Integer, Integer> sums = new HashMap<>();

        int prefixSum=0;
        int count=0;

        sums.put(0,1);

        for(int i=0; i< nums.length; i++){

            prefixSum+= nums[i];
            int checker = prefixSum - k;
            if(sums.containsKey(checker)){
                count+= sums.get(checker);  // adding the number of occurences of subarray sum k
            }

            sums.put(prefixSum, sums.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}
