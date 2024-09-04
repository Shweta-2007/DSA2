package DSA2.ADVANCE_DSA.TEST_PRACTICE.SORTING;

import java.util.*;

// QUICK SORT
public class EIGHT {
    public static int PartitionIndex(int arr[], int low, int high) {
        // choose right most element as pivot
        int pivot = arr[high];
        // index of smaller element
        int i = low - 1;
        for (int j = low; j < high; j++) {
            // if curent element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // swap elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void QuickSort(int arr[], int low, int high) {
        if (low >= high) {
            // find partition index
            int pi = PartitionIndex(arr, low, high);
            // recursively sort elements after each partition
            QuickSort(arr, low, pi - 1);
            QuickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        QuickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
