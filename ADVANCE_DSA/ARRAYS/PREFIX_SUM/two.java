package DSA2.ADVANCE_DSA.ARRAYS.PREFIX_SUM;

import java.util.*;

// index after removing which sum of even indexed elements equals to sum of odd indexed elements
public class two {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6, 4 };
        int n = arr.length;
        int evenIndexedSum = 0;
        int oddIndexedSum = 0;

        // even indexed prefix sum
        int evenPsum[] = new int[n];
        evenPsum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                evenPsum[i] = evenPsum[i - 1] + arr[i];
            } else {
                evenPsum[i] = evenPsum[i - 1];
            }
        }
        // odd indexed prefix sum
        int oddPsum[] = new int[n];
        oddPsum[0] = n > 1 ? arr[1] : 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 1) {
                oddPsum[i] = oddPsum[i - 1] + arr[i];
            } else {
                oddPsum[i] = oddPsum[i - 1];
            }
        }

        System.out.println(Arrays.toString(evenPsum));
        System.out.println(Arrays.toString(oddPsum));

        for (int i = 0; i < n; i++) {
            evenIndexedSum = (i > 0 ? evenPsum[i - 1] : 0) + oddPsum[n - 1] - oddPsum[i];
            oddIndexedSum = (i > 0 ? oddPsum[i - 1] : 0) + evenPsum[n - 1] - evenPsum[i];
            if (evenIndexedSum == oddIndexedSum) {
                System.out.println("evenIndexedSum:" + evenIndexedSum);
                System.out.println("oddIndexedSum:" + oddIndexedSum);
                System.out.println("index is: " + i);
                break;
            }
        }

    }
}
