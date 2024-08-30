package DSA2.ADVANCE_DSA.SORTING;

import java.util.*;

// find 2 restaurants which are closer to me, (0,0)
public class sixteen {
    public static int[][] closerRes(int[][] arr, int B) {
        // sort the array on the basis of distance
        Arrays.sort(arr, (a, b) -> {
            int distanceA = a[0] * a[0] + a[1] * a[1];
            int distanceB = b[0] * b[0] + b[1] * b[1];

            return Integer.compare(distanceA, distanceB);
        });

        int[][] ans = new int[B][2];
        for (int i = 0; i < B; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 3 }, { 3, 4 }, { 2, 5 }, { 6, 7 } };
        int B = 2;
        int result[][] = closerRes(arr, B);
        for (int[] r : result) {
            System.out.println(Arrays.toString(r));
        }
    }
}
