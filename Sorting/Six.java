package DSA2.Sorting;

import java.util.Arrays;

public class Six {

    public static void main(String[] args) {
        int A[] = { 2, 4, 1 };

        int n = A.length;
        Arrays.sort(A);
        int difference = A[1] - A[0];

        // 3, 5, 1
        for (int i = 2; i < n; i++) {
            if (A[i] - A[i - 1] != difference) {
                System.out.println("0");
            }
        }

        System.out.println("1");

    }

}
