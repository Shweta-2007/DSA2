package DSA2.SlidingWindow;

// Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.
// Note: It is possible to swap any two elements, not necessarily consecutive.

public class Two {
    public static void main(String[] args) {
        int[] A = { 5, 17, 100, 11 };
        int N = A.length;
        int B = 20;
        int badCount = 0;
        int goodCount = 0;
        int ans = Integer.MAX_VALUE;

        // GOOD COUNT
        for (int i = 0; i < N; i++) {
            if (A[i] < B) {
                goodCount++;
            }
        }

        // CREATE WINDOW
        for (int i = 0; i < goodCount; i++) {
            if (A[i] >= B) {
                badCount++;
            }
        }

        ans = badCount;
        // SLIDE THE WINDOW
        for (int i = 1; i <= N - goodCount; i++) {
            if (A[i - 1] > B) {
                badCount--;
            }

            if (A[i + goodCount - 1] > B) {
                badCount++;
            }

            ans = Math.min(ans, badCount);
        }

        System.out.println(ans);

    }
}