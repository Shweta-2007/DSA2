package DSA2.ADVANCE_DSA.ARRAYS.PREFIX_SUM;

import java.util.*;

// find prefix sum of even indexed element only
public class one {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 0, 6, 1, 2, 9, 4, 8 };
        int pSum[] = new int[arr.length];
        pSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                pSum[i] = pSum[i - 1] + arr[i];
            } else {
                pSum[i] = pSum[i - 1];
            }

        }

        System.out.println(Arrays.toString(pSum));

    }
}
