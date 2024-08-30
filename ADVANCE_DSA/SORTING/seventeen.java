package DSA2.ADVANCE_DSA.SORTING;

import java.util.*;
// Given an Aay with N objects colored red, white, or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white, and blue.We will represent the colors as,red -> 0,white -> 1,blue -> 2,Note: Using the library sort function is not allowed.
// DUTCH NATIONAL FLAG ALGORITHM

public class seventeen {
    public static void main(String[] args) {
        int A[] = { 0, 1, 2, 0, 1, 2 };
        int low = 0, mid = 0, high = A.length - 1;
        while (mid <= high) {
            switch (A[mid]) {
                case 0:
                    // swap low with mid
                    int temp = A[low];
                    A[low] = A[mid];
                    A[mid] = temp;

                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    // swap mid with high
                    int temp2 = A[high];
                    A[high] = A[mid];
                    A[mid] = temp2;
                    high--;
                    break;

            }
        }

        System.out.println(Arrays.toString(A));

    }
}
