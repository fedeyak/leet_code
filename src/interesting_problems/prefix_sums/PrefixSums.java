package interesting_problems.prefix_sums;

import java.util.Scanner;

public class PrefixSums {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] nums = new int[length];
        nums[0] = scanner.nextInt();
        for (int i = 1; i < length; i++) {
            nums[i] = nums[i-1] + scanner.nextInt();
        }
        scanner.close();

        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}
