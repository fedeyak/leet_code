package interesting_problems.dinamic_programming;

// Зайчик хочет добраться до вершины лестницы с n ступеньками.
// Каждая ступенька имеет определённую стоимость,
// которую зайчик должен заплатить, чтобы наступить на неё.
// Он может прыгать на одну или две ступеньки.
// Определите минимальную стоимость, которую зайчик должен заплатить, чтобы достичь вершины.

public class BunnyStairsCost {
    public static int minCost(int[] cost) {
        int n = cost.length;

        if (n == 1) return cost[0];
        if (n == 2) return Math.min(cost[0], cost[1]);

        int[] dp = new int[n];

        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }

        return Math.min(dp[n - 1], dp[n - 2]);
    }

    public static void main(String[] args) {
        int[] cost = {10, 15, 20, 5, 7};
        System.out.println("Минимальная стоимость: " + minCost(cost)); // Ожидаемый результат: 22
    }

}
