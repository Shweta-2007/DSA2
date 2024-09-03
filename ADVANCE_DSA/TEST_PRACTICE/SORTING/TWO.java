package DSA2.ADVANCE_DSA.TEST_PRACTICE.SORTING;

import java.util.*;

// COUNT SORT for negative number
public class TWO {
    public static void main(String[] args) {
        int arr[] = { -2, 3, 8, 3, -2, 3 };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        int range = max - min + 1; // 8 + 2 + 1 = 11
        int farr[] = new int[range];
        for (int i = 0; i < arr.length; i++) {
            farr[arr[i] - min]++;
        }
        int index = 0;
        // [2, 0, 0, 0, 0, 3, 0, 0, 0, 0, 1]
        for (int digit = min; digit <= max; digit++) {
            for (int i = 0; i < farr[digit - min]; i++) {
                arr[index] = digit;
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
