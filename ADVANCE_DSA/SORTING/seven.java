package DSA2.ADVANCE_DSA.SORTING;

import java.util.*;

// Given two array A[n] and B[n]. Calculate number of pairs i,j such that A[i] > B[j], 
public class seven {
    public static void main(String[] args) {

        int arr1[] = { 7, 3, 5 }; // 3,5,7
        int arr2[] = { 2, 0, 6 }; // 0,2,6

        // sort the array
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int count = 0;
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                count += arr1.length - i;
                j++;
            } else {
                i++;
            }
        }
        System.out.println(count);
    }
}
