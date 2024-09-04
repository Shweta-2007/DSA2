package DSA2.ADVANCE_DSA.TEST_PRACTICE.SORTING;

import java.util.*;

// Given an integer array, Consider first elements as pivot, rearrange the elements such that for all i:
// if A[i] <= pivot, then it should be present on left side if greater then on right side
public class SEVEN {
    public static void main(String[] args) {
        int arr[] = { 54, 26, 93, 17, 77, 31, 44, 55, 20 };
        int pivot = arr[0];

        int left = 1;
        int right = arr.length - 1;
        while (left <= right) {
            if (arr[left] <= pivot) {
                // do nothing
                left++;
            } else if (arr[right] > pivot) {
                // do nothing
                right--;
            } else {
                // swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        // swap right with pivot
        int temp = arr[0];
        arr[0] = arr[right];
        arr[right] = temp;

        System.out.println(Arrays.toString(arr));

    }
}
