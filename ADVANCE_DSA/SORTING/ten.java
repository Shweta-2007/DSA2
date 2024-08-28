package DSA2.ADVANCE_DSA.SORTING;

import java.util.*;

// quick sort
public class ten {
    public static int partition(int arr[], int left, int right) {
        int pivot = arr[right];
        while (left <= right) {
            if (arr[left] <= pivot) {
                left++;
            } else if (arr[right] > pivot) {
                right--;
            } else {
                // swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        // finally swap pivot
        int temp = pivot;
        pivot = arr[right];
        arr[right] = temp;
        return right;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }

        int pivotIndex = partition(arr, low, high);

        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }

    public static void main(String[] args) {
        int arr[] = { 45, 0, 65, 99, 2, 9, 650 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
