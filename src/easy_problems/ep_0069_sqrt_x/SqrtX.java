package easy_problems.ep_0069_sqrt_x;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SqrtX {


    public static void main(String[] args) {
        System.out.println(mySqrt(9));
    }

    public static int mySqrt(int x) {
        Map<Integer, Integer> figuresAndSqrts = new HashMap<>();
        int num = Integer.MAX_VALUE;
        int sqrt = 0;
        for (int i = 1; sqrt <= num; i++) {
            sqrt = i * i;
            if (sqrt < 0) {
                break;
            }
            figuresAndSqrts.put(sqrt, i);
        }
        List<Integer> sqrts = new ArrayList<>(figuresAndSqrts.keySet());

        int start = 0;
        int end = sqrts.size();
        int previousMiddle = 0;
        while (start < end) {
            int middle = start + ((end - start) / 2);
            if (x == middle) {
                return figuresAndSqrts.get(x);
            }
            previousMiddle = middle;
        }
        return previousMiddle;
    }
}
