package yandex;

import java.util.Scanner;

public class IntersectingSegments {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int[] a = new int[N];
            int[] b = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = scanner.nextInt();
                b[i] = scanner.nextInt();
            }
            scanner.close();
            intersectingSegments(a, b);
        }



    private static int intersectingSegments(int[] a, int[] b) {
        List<int[]>
    }

}
