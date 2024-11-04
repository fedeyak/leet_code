package interesting_problems.dinamic_programming;

// Черепашка находится в верхнем левом углу матрицы (0,0)
// и хочет добраться до нижнего правого угла матрицы (m-1,n-1).
// Каждая клетка матрицы имеет определённую стоимость.
// Черепашка может двигаться только вправо или вниз.
// Определите минимальную стоимость, которую черепашка должна заплатить, чтобы добраться до цели.

public class TurtleMinCost {
    public static int minCost(int[][] cost) {
        int m = cost.length;
        int n = cost[0].length;

        // Создаем массив dp для хранения минимальной стоимости на каждой клетке
        int[][] dp = new int[m][n];

        // Заполняем начальные условия
        dp[0][0] = cost[0][0];

        // Заполняем первую строку
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + cost[0][j];
        }

        // Заполняем первый столбец
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + cost[i][0];
        }

        // Заполняем остальную часть массива dp
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = cost[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        // Ответ — минимальная стоимость на последней клетке
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] cost = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        System.out.println("Минимальная стоимость: " + minCost(cost)); // Ожидаемый результат: 7
    }
}
