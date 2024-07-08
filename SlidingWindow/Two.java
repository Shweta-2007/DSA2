package DSA2.SlidingWindow;

// Given an array A of size N, find the subarray of size B with the least average.

// Return the index of the first element of the subarray of size B that has least average.
// Array indexing starts from 0.

public class Two {
    public static void main(String[] args) {
        int[] A = { 3, 7, 5, 20, -10, 0, 12 };
        int N = A.length;
        int B = 2;
        int minSum = 0;
        int sum = 0;
        int minIndex = 0;

        // CREATE WINDOW
        for (int i = 0; i < B; i++) {
            sum = sum + A[i];
        }

        minSum = sum;

        // SLIDE THE WINDOW
        for (int i = 1; i < N - B; i++) {
            sum = sum - A[i - 1] + A[B + i - 1];

            if (sum < minSum) {
                minSum = sum;
                minIndex = i;
            }

        }
        System.out.println(minIndex);
    }
}