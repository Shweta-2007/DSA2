package DSA2.Assignment;

import java.util.Arrays;

// return an array of integers denoting the prefix sum of the given array
public class Four {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int psumArray[] = new int[n];
        psumArray[0] = arr[0];
        for (int i = 1; i < n; i++) {
            psumArray[i] = psumArray[i - 1] + arr[i];
        }

        System.out.println(Arrays.toString(psumArray));

    }
}
