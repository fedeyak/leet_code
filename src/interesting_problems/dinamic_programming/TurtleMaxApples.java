package interesting_problems.dinamic_programming;

// Черепашка находится в верхнем левом углу матрицы (0,0)
// и хочет добраться до нижнего правого угла матрицы (m-1,n-1).
// Она может двигаться только вправо или вниз.
// На каждой клетке матрицы лежит число, представляющее количество яблок.
// Определите максимальное количество яблок, которое черепашка может собрать, добираясь до цели.

public class TurtleMaxApples {
    public static int maxApples(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Создаем массив dp для хранения максимального количества яблок на каждой клетке
        int[][] dp = new int[m][n];

        // Заполняем начальные условия
        dp[0][0] = grid[0][0];

        // Заполняем первую строку
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        // Заполняем первый столбец
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        // Заполняем остальную часть массива dp
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = grid[i][j] + Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        // Ответ — максимальное количество яблок на последней клетке
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] grid = {
                {5, 3, 2, 1},
                {1, 2, 10, 1},
                {4, 3, 2, 20},
                {1, 2, 1, 5}
        };
        System.out.println("Максимальное количество яблок: " + maxApples(grid)); // Ожидаемый результат: 34
    }
}

