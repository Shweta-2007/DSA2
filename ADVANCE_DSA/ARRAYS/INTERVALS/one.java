package DSA2.ADVANCE_DSA.ARRAYS.INTERVALS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// You are given a collection of intervals A in a 2-D array format, where each interval is represented by a pair of integers `[start, end]`. The intervals are sorted based on their start values.

// Your task is to merge all overlapping intervals and return the resulting set of non-overlapping intervals.
public class one {
    public static void main(String[] args) {
        int[][] A = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

        List<int[]> result = new ArrayList<>();
        int[] currentInterval = A[0]; // {1,3}
        result.add(currentInterval);

        // iterate through rest of intervals
        for (int i = 1; i < A.length; i++) {
            int interval[] = A[i];
            if (interval[0] <= currentInterval[1]) {
                currentInterval[1] = Math.max(currentInterval[1], interval[1]);
            } else {
                currentInterval = interval;
                result.add(currentInterval);
            }
        }

        int[][] ans = result.toArray(new int[result.size()][]);
        System.out.println(Arrays.toString(ans));

    }

}