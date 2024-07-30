package DSA2.ADVANCE_DSA.ARRAYS.INCREMENT_ELEMENTS;

import java.util.*;

public class two {
    public static void main(String[] args) {
        int arr[] = { 0, 3, 7, 6, 4, 0, 5, 5, 5 };
        int n = arr.length;
        boolean allNine = true;
        for (int i = n - 1; i >= 0; i--) {
            System.out.println("entered 1");
            if (arr[i] < 9) {
                arr[i]++;
                allNine = false;
                break;
            } else {
                arr[i] = 0;
            }
        }

        // if all digits are 9,9
        if (allNine) {
            System.out.println("entered 2");
            int newArr[] = new int[n + 1];
            newArr[0] = 1;
            System.out.println(Arrays.toString(newArr));
        } else {
            System.out.println(Arrays.toString(arr));
        }

    }
}
