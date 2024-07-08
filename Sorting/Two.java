package DSA2.Sorting;

import java.util.Arrays;

public class Two {
    public static void main(String[] args) {
        Integer arr[] = { 1, -5, 3, 5, -10, 4 };
        int n = arr.length;
        int nobelCount = 0;

        // for (int i = 0; i < n; i++) {
        // int smallerCount = 0;
        // for (int j = 0; j < n; j++) {
        // if (arr[j] < arr[i]) {
        // smallerCount++;
        // }

        // }

        // if (smallerCount == arr[i]) {
        // nobelCount++;
        // }
        // }

        // OPTIMISED CODE

        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] == i) {
                nobelCount++;
            }
        }

        System.out.println(nobelCount);

    }

}
