package interesting_problems.dinamic_programming;

// Дан двумерный массив matrix размера m×n, состоящий из 0 и 1.
// Найдите максимальный прямоугольник, состоящий только из 1 в этой матрице.
// Верните его площадь.

import java.util.Stack;

public class MaxRectangle {
    public static int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;

        int m = matrix.length;
        int n = matrix[0].length;
        int maxArea = 0;

        int[] height = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                height[j] = matrix[i][j] == '0' ? 0 : height[j] + 1;
            }
            maxArea = Math.max(maxArea, largestRectangleArea(height));
        }

        return maxArea;
    }

    private static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        int index = 0;

        while (index < heights.length) {
            if (stack.isEmpty() || heights[stack.peek()] <= heights[index]) {
                stack.push(index++);
            } else {
                int top = stack.pop();
                int area = heights[top] * (stack.isEmpty() ? index : index - stack.peek() - 1);
                maxArea = Math.max(maxArea, area);
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            int area = heights[top] * (stack.isEmpty() ? index : index - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        char[][] matrix = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        System.out.println("Максимальная площадь прямоугольника: " + maximalRectangle(matrix)); // Ожидаемый результат: 6
    }
}

