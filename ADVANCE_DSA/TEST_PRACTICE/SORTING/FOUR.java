package DSA2.ADVANCE_DSA.TEST_PRACTICE.SORTING;

import java.util.*;

// MERGE SORT
public class FOUR {
    public static void MergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;
        MergeSort(arr, start, mid);
        MergeSort(arr, mid + 1, end);
        // merge both sorted array
        merge2SortedArray(arr, end, mid, start);
    }

    public static void merge2SortedArray(int[] arr, int high, int mid, int low) {
        int ans[] = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                ans[k] = arr[i];
                i++;
                k++;
            } else {
                ans[k] = arr[j];
                j++;
                k++;
            }
        }

        while (i <= mid) {
            ans[k] = arr[i];
            i++;
            k++;
        }
        while (j <= high) {
            ans[k] = arr[j];
            j++;
            k++;
        }

        for (k = 0; k < ans.length; k++) {
            arr[k + low] = ans[k];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        MergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
