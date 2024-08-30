package DSA2.ADVANCE_DSA.SORTING;

import java.util.*;
// Given an array of integers A, sort the array into a wave like array and return it. Input: [1,2,3,4] output: [2,1,4,3], A[0] >= A[1] <= A[2] >= A[3] ...

public class fourteen {
    public static void waveArray(int[] arr) {
        Arrays.sort(arr);
        // now swap the elements
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        waveArray(arr);
        System.out.println(Arrays.toString(arr));
    }

}
