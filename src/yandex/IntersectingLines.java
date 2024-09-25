package yandex;

import java.util.*;

public class IntersectingLines {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int[] a = new int[N];
            int[] b = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = scanner.nextInt();
                b[i] = scanner.nextInt();
            }

            int[][] array = removeDuplicates(a, b);

            System.out.println(intersectingLines(array[0], array[1]));

        }



    private static int intersectingLines(int[] startingPoints, int[] endPoints) {
        List<int[]> lines = new ArrayList<>();
        int length = startingPoints.length;
        for (int i = 0; i < length; i++) {
            lines.add(new int[]{startingPoints[i], 1});
            lines.add(new int[]{endPoints[i], -1});
        }

        lines.sort((point1, point2) -> point1[0] != point2[0] ? point1[0] - point2[0] : point1[1] - point2[1]);


        int noIntersections = 0;
        int sum = 0;
        for(int i = 0; i < length; i++) {
            int[] point = lines.get(i);
            sum += point[1];
            if (sum == 0) {
                noIntersections++;
            }
        }
        return noIntersections;
    }

    private static int[][] removeDuplicates(int[] array1, int[] array2) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        ArrayList<Integer> filteredArray1 = new ArrayList<>();
        ArrayList<Integer> filteredArray2 = new ArrayList<>();

        for (int num : array1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < array1.length; i++) {
            if (frequencyMap.get(array1[i]) == 1) {
                filteredArray1.add(array1[i]);
                filteredArray2.add(array2[i]);
            }
        }

        int[] newArray1 = filteredArray1.stream().mapToInt(i -> i).toArray();
        int[] newArray2 = filteredArray2.stream().mapToInt(i -> i).toArray();

        return new int[][]{newArray1, newArray2};
    }

}
