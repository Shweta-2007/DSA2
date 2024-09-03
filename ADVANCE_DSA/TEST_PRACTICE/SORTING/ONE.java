package DSA2.ADVANCE_DSA.TEST_PRACTICE.SORTING;

import java.util.*;

// COUNT SORT
// Find the smallest number that can be formed by rearranging the digits of the given number in an array. Return the smallest number in the form of an array
public class ONE {
    public static void main(String[] args) {
        int arr[] = { 6, 3, 4, 2, 7, 2, 1 };
        // sort in ascending order
        int farr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            farr[arr[i]]++;
        }
        // [0, 1, 2, 1, 1, 0, 1, 1, 0, 0]
        int index = 0;
        for (int digit = 0; digit <= 9; digit++) {
            for (int i = 0; i < farr[digit]; i++) {
                arr[index] = digit;
                index++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
