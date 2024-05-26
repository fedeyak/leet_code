package medium_problems.mp_0436_find_right_interval;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class FindRightInterval {

    // 5 ms
    public int[] findRightInterval(int[][] intervals) {
        int length = intervals.length;
        int[] rightIntervals = new int[length];
        if (intervals[0][0] > intervals[length - 1][0]) {
            for (int i = 0; i < length; i++) {
                rightIntervals[i] = binarySearchDescending(intervals, intervals[i][1]);
            }
        } else {
            for (int i = 0; i < length; i++) {
                rightIntervals[i] = binarySearchAscending(intervals, intervals[i][1]);
            }
        }
        return rightIntervals;
    }

    private int binarySearchDescending(int[][] intervals, int target) {
        int start = 0;
        int end = intervals.length;

        while (start + 1 < end) {
            int middle = (start + end) / 2;
            if (intervals[middle][0] == target) return middle;
            if (intervals[middle][0] < target) end = middle;
            else start = middle + 1;
        }
        if (intervals[start][0] >= target) return start;
        return -1;
    }

    private int binarySearchAscending(int[][] starts, int target) {
        int start = 0;
        int end = starts.length - 1;

        while (start < end) {
            int middle = (start + end) / 2;
            if (starts[middle][0] == target) return middle;
            if (starts[middle][0] > target) end = middle;
            else start = middle + 1;
        }
        if (starts[end][0] >= target) return end;
        return -1;
    }

    // 399 ms. This is the ugliest code I've written so far. Well... however it works.
//    public static int[] findRightInterval(int[][] intervals) {
//        int length = intervals.length;
//        int[] starts = new int[length];
//        int[] rightIntervals = new int[length];
//        for (int i = 0; i < length; i++) {
//            starts[i] = intervals[i][0];
//        }
//        for (int i = 0; i < length; i++) {
//            int min = -1;
//            int rightIndex = -1;
//            int currentNumber = intervals[i][1];
//            for (int j = 0; j < length; j++) {
//
//                if (currentNumber == starts[j]) {
//                    rightIndex = j;
//                    break;
//                }
//                if (min == -1 && starts[j] > currentNumber) {
//                    min = starts[j];
//                    rightIndex = j;
//                }
//                if (min != -1 && starts[j] < min && currentNumber < starts[j]) {
//                    min = starts[j];
//                    rightIndex = j;
//                }
//            }
//            rightIntervals[i] = rightIndex;
//        }
//        return rightIntervals;
//    }

}
