package DSA2.ADVANCE_DSA.TEST_PRACTICE.SORTING;

import java.util.*;

// Merge two sorted arrays
public class THREE {
    public static void main(String[] args) {
        int arr1[] = { 2, 4, 7, 8, 12 };
        int arr2[] = { 3, 5, 6, 7 };
        int n1 = arr1.length;
        int n2 = arr2.length;
        int ans[] = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                i++;
                k++;
            } else {
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < n1) {
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            ans[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(ans));
    }
}
