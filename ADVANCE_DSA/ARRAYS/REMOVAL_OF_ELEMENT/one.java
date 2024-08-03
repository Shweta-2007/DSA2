package DSA2.ADVANCE_DSA.ARRAYS.REMOVAL_OF_ELEMENT;

import java.util.*;

// Given an integer array of A of size N. You can remove any element from the array in one operation. The cost of operation is sum of all elements in the array present before this operation. Find the minimum cost to remove all elements from the array
public class one {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 2, 5, 6 };
        int n = arr.length;
        int result = 0;

        // sort array in descending order
        Integer[] B = new Integer[n];
        for (int i = 0; i < n; i++) {
            B[i] = arr[i];
        }

        Arrays.sort(B, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            result += B[i] * (i + 1);
        }

        System.out.println(result);
    }
}
