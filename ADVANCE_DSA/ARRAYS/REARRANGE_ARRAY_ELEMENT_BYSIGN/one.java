package DSA2.ADVANCE_DSA.ARRAYS.REARRANGE_ARRAY_ELEMENT_BYSIGN;

import java.util.*;

public class one {
    public static void main(String[] args) {
        int arr[] = { 1, 2, -3, -1, -2, 3 };
        // output => {1,-3,2,-1,3,-2}
        int n = arr.length;

        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];

        int posIndex = 0;
        int negIndex = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos[posIndex] = arr[i];
                posIndex++;
            } else {
                neg[negIndex] = arr[i];
                negIndex++;
            }

        }

        // positive on even indices and negative on even indices
        for (int i = 0; i < n / 2; i++) {
            arr[i * 2] = pos[i];
            arr[i * 2 + 1] = neg[i];
        }

        System.out.println(Arrays.toString(arr));

    }
}
