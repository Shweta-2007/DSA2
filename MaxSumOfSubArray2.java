package DSA2;

public class MaxSumOfSubArray2 {
    public static void main(String[] args) {
        int[] arr = { -3, 4, -2, 5, 3, -2, 8, 2, -1, 4 };
        int n = arr.length;
        int k = 5;
        int currentSum = 0;
        int maxSum = 0;

        // CREATE WINDOW
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        maxSum = currentSum;

        // SLIDE THE WINDOW
        for (int i = k; i < n; i++) {
            currentSum = currentSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);

    }
}
