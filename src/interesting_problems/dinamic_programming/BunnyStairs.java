package interesting_problems.dinamic_programming;

// Зайчик хочет добраться до вершины лестницы с n ступеньками.
// Он может прыгнуть на одну или две ступеньки вперед.
// На каждой ступеньке лежит определённое количество морковок.
// Зайчик хочет собрать максимальное количество морковок, чтобы добраться до последней ступеньки.
// Определите максимальное количество морковок, которые зайчик может собрать.

public class BunnyStairs {

    public static int maxCarrots(int[] carrots) {
        int n = carrots.length;
        if (n == 1) return carrots[0];
        if (n == 2) return Math.max(carrots[0], carrots[1]);

        int[] dp = new int[n];

        dp[0] = carrots[0];
        dp[1] = carrots[1];

        for (int i = 2; i < n; i++) {
            dp[i] = carrots[i] + Math.max(dp[i - 1], dp[i - 2]);
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        int[] carrots = {10, 1, 1, 10, 1};
        System.out.println("Максимальное количество морковок: " + maxCarrots(carrots)); // Ожидаемый результат: 15
    }
}
