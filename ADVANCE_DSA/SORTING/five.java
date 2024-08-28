package DSA2.ADVANCE_DSA.SORTING;

import java.util.*;

// Merge sort => here we are creating new arrays that is left and right
public class five {
    public static void mergeSort(int[] arr) {
        // base condition
        if (arr.length == 1) {
            return;
        }

        int mid = arr.length / 2;
        int left[] = new int[mid];
        int right[] = new int[arr.length - mid];

        // populate both arrays
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }

        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        // Recursive calls
        mergeSort(left);
        mergeSort(right);

        // merge the sorted arrays
        mergeSortedArrays(left, right, arr);
    }

    public static int[] mergeSortedArrays(int arr1[], int arr2[], int[] arr) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
                k++;
            } else {
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < n1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 1, 0, 34, 78, 16 };
        System.out.println("Original array: " + Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
