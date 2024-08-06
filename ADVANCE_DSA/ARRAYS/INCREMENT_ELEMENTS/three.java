package DSA2.ADVANCE_DSA.ARRAYS.INCREMENT_ELEMENTS;

import java.util.Arrays;

// Given an integer array A such that all the elements in the array are 0. Return the final array after performing multiple queries. query:(start,end,x) : add x to all elements from index i to j
public class three {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0, 0, 0, 0 };
        int Q[][] = { { 1, 3, 2 }, { 2, 5, 3 }, { 5, 6, -1 } };
        int n = arr.length;

        int diff[] = new int[n + 1];
        for (int[] query : Q) {
            int start = query[0];
            int end = query[1];
            int x = query[2];
            // Increment start index by x
            diff[start] += x;

            // Decrement the element after end index by x
            if (end + 1 < n) {
                diff[end + 1] -= x;
            }
        }

        int result[] = new int[n];
        result[0] = diff[0];
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] + diff[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
