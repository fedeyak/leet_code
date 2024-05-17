package easy_problems.ep_0704_binary_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums  = {9};
        System.out.println(search(nums, 9));
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        int middle = end / 2;

        while (start < end) {
            if (nums[middle] > target) {
                end = middle;
                middle = middle / 2;
            } else if (nums[middle] < target) {
                start = middle + 1;
                middle = end + (middle - end) / 2;
            } else return middle;
        }

        return -1;
    }
}
