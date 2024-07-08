package DSA2.Sorting;

import java.util.Arrays;
import java.util.Collections;

public class One {
    public static void main(String[] args) {
        Integer[] arr = { 3, 5, 1, -3 };
        int n = arr.length;
        int minCost = 0;

        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            minCost += (arr[i] * (i + 1));
        }

        System.out.println(minCost);
    }
}
