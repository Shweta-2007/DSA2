package DSA2.ADVANCE_DSA.SORTING;

import java.util.*;

// Given arr[N], sort the data in ascending order of count of factors. If count of factors are equal then sort the elements on the basis of their values
public class eleven {
    public static int factorsCount(int n) {
        int factors = 0;
        for (int i = 1; i * i < n; i++) {
            if (n % i == 0) {
                if (n == i * i) {
                    factors++;
                } else {
                    factors = factors + 2;
                }
            }
        }
        return factors;
    }

    public static void main(String[] args) {
        Integer arr[] = { 9, 3, 10, 6, 4 };
        // Sort using a custom operator

        Arrays.sort(arr, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                int fa = factorsCount(a);
                int fb = factorsCount(b);

                if (fa == fb) {
                    // if factors are equal then compare by its value
                    if (a < b)
                        return -1;
                    else if (b < a)
                        return 1;
                    else
                        return 0;
                } else if (fa < fb) {
                    return -1;
                } else {
                    return 1;
                }

            }
        });

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
