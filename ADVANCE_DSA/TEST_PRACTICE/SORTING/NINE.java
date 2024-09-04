package DSA2.ADVANCE_DSA.TEST_PRACTICE.SORTING;

import java.util.*;

// Given arr[N], sort the data in ascending order of count of factors. If count of factors are equal then sort the elements on the basis of their values
public class NINE {
    public static int CountFactors(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }

    public static void CompareFunction(int arr[]) {
        // convert int to Integer
        Integer newArr[] = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        // sort using lamda expression
        Arrays.sort(newArr, (a, b) -> {
            int fa = CountFactors(a);
            int fb = CountFactors(b);

            if (fa != fb) {
                return Integer.compare(fa, fb);
            } else {
                return Integer.compare(a, b);
            }
        });
        System.out.println(Arrays.toString(newArr));
    }

    public static void main(String[] args) {
        int arr[] = { 9, 3, 10, 6, 4 };
        CompareFunction(arr);

    }
}
