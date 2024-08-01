package DSA2.ADVANCE_DSA.ARRAYS.FIRST_MISSING;

import java.util.Arrays;

// Given an unsorted integer array, A of size N. Find the first missing positive integer.

// Note: Your algorithm should run in O(n) time and use constant space.
public class one {
    public static void main(String[] args) {
        int arr[] = { 3, 4, -1, 1 };
        int n = arr.length;
        boolean found = false;
        // {1,-1,3,4} => 2 is missing

        // place each number in its correct position
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                // swap elements
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                System.out.println(i + 1);
                found = true;
                break;
            }
        }

        // if all are at correct position
        if (!found) {
            System.out.println(n + 1);
        }
    }
}
