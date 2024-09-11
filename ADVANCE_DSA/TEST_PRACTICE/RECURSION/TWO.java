package DSA2.ADVANCE_DSA.TEST_PRACTICE.RECURSION;

import java.util.*;

// Find all index at which B occurs in the array
public class TWO {

    public static int[] allIndices(int arr[], int index, int B, int count) {
        if (index == arr.length) {
            return new int[count];
        }

        if (arr[index] == B) {
            int[] result = allIndices(arr, index + 1, B, count + 1);
            result[count] = index;
            return result;
        } else {
            return allIndices(arr, index + 1, B, count);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 3, 1, 5, 4, 5 };
        int B = 5;
        int ans[] = allIndices(arr, 0, B, 0);
        System.out.println(Arrays.toString(ans));
    }
}
