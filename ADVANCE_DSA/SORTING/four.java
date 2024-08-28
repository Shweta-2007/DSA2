package DSA2.ADVANCE_DSA.SORTING;

import java.util.*;

// Merge two sorted arrays
public class four {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int mergedArray[] = new int[n1 + n2];
        int i = 0, j = 0, k = 0; // variable for three arrays
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
                k++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
                k++;
            }
        }

        // if arr1 has elements left
        while (i < n1) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        // if arr2 has elements left
        while (j < n2) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 4, 7, 8, 12 };
        int arr2[] = { 3, 5, 6, 7 };
        int ans[] = mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(ans));
    }
}
