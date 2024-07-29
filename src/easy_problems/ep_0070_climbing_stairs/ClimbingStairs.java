package easy_problems.ep_0070_climbing_stairs;

public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println("Should return 1: " + climbStairs(1));
        System.out.println("Should return 2: " + climbStairs(2));
        System.out.println("Should return 3: " + climbStairs(3));
        System.out.println("Should return 5: " + climbStairs(4));
    }

    public static int climbStairs(int n) {
        int first = 1;
        int second = 2;
        int temp = 0;

        if (n == 1) {
            return first;
        }
        if (n == 2) {
            return second;
        }
        for (; n>2; n--) {
            temp = second;
            second += first;
            first = temp;
        }
        return second;
    }

//    public static int climbStairs(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        if (n == 2) {
//            return 2;
//        }
//        return climbStairs(n - 1) + climbStairs(n - 2);
//    }
}
