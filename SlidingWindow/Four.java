package DSA2.SlidingWindow;

// Given an array of integers A and an integer K, find the maximum sum of any subarray of size K.
public class Four {
    public static void main(String[] args) {
        int A[] = { 100, 200, 300, 400 };
        int N = A.length;
        int k = 2;
        int sum = 0;
        int maxSum = 0;

        for (int i = 0; i < k; i++) {
            sum += A[i];
        }

        maxSum = sum;

        for (int i = 1; i <= N - k; i++) {
            sum = sum - A[i - 1] + A[i + k - 1];
            // System.out.println(sum);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}
