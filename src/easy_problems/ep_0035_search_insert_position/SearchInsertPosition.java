package easy_problems.ep_0035_search_insert_position;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = new int[]{5};
        System.out.println(searchInsert(nums, 6));
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        int middle = end / 2;
        int previous = 0;


        while (start < end) {
            previous = middle;
            if (nums[middle] > target) {
                end = middle;
                middle = middle / 2;
            } else if (nums[middle] < target) {
                start = middle + 1;
                middle =  end + (middle - end) / 2;
            } else return middle;
        }
        return previous + 1;
    }
}
