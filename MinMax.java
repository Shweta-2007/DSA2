package DSA2;

import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 6, 4, 5, 1, 5, 2, 6, 4, 1 };
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Find max and min in the array
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        // Generate all subarrays
        int subArrayCount = n * (n + 1) / 2; // Total number of subarrays
        int subArrays[][] = new int[subArrayCount][];
        int index = 0;

        // Generate subarrays
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int subArrayLength = end - start + 1;
                int subArray[] = new int[subArrayLength];

                // Copy elements to subarray
                for (int k = start; k <= end; k++) {
                    subArray[k - start] = arr[k];
                }

                // Store subarray in subArrays array
                subArrays[index++] = subArray;
            }
        }

        int ans = arr.length;
        for (int[] subArray : subArrays) {
            Boolean containsMax = false;
            Boolean containsMin = false;

            for (int num : subArray) {
                if (num == max)
                    containsMax = true;
                if (num == min)
                    containsMin = true;
            }

            if (containsMax && containsMin) {
                ans = Math.min(ans, subArray.length);
            }
        }

        System.out.println(ans);

    }
}
