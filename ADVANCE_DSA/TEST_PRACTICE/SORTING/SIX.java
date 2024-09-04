package DSA2.ADVANCE_DSA.TEST_PRACTICE.SORTING;

import java.util.*;

// Given an array A[n]. Calculate number of pairs [i, j] such that i < j && A[i] > A[j], These are called inversion pairs. => use merge sort
public class SIX {
    public static int InversionPair(int arr[], int start, int end) {
        if (start >= end) {
            return 0;
        }
        int mid = (start + end) / 2;
        int f1 = InversionPair(arr, start, mid);
        int f2 = InversionPair(arr, mid + 1, end);
        int f3 = merge2SortedArrays(arr, start, end, mid);
        return f1 + f2 + f3;
    }

    public static int merge2SortedArrays(int arr[], int low, int high, int mid) {
        int ans[] = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;
        int count = 0;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                ans[k] = arr[i];
                i++;
                k++;
            } else {
                ans[k] = arr[j];
                count += (mid - i + 1);
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

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 6, 1 };
        int pairs = InversionPair(arr, 0, arr.length - 1);
        System.out.println(pairs);
    }
}
