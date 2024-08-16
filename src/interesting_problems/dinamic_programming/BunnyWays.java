package interesting_problems.dinamic_programming;

// Зайчик находится на первой ступеньке лестницы с n ступеньками и хочет добраться до вершины.
// Он может прыгнуть на одну или две ступеньки.
// Определите, сколько различных способов есть у зайчика, чтобы достичь вершины.

public class BunnyWays {
    public static int countWays(int n) {
    // Если лестница имеет только одну или две ступеньки
        if (n == 1) return 1;
        if (n == 2) return 2;

    int[] dp = new int[n + 1];

    // Начальные условия
    dp[1] = 1;
    dp[2] = 2;


        // Динамическое программирование для вычисления количества способов
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // Ответ — количество способов добраться до вершины
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Количество способов: " + countWays(n)); // Ожидаемый результат: 8
    }

}
