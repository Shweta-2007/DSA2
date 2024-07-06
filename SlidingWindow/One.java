package DSA2.SlidingWindow;

// You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
// But the sum must not exceed B.
public class One {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 4, 5 };
        int n = arr.length;
        int b = 12;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        int left = 0;
        int right = 0;

        while (right < n) {
            currentSum += arr[right];

            while (currentSum < b && left <= right) {
                currentSum -= arr[left];
                left++;
            }
            if (currentSum <= b) {
                maxSum = Math.max(maxSum, currentSum);
            }
            right++;
        }

        System.out.println(maxSum);
    }
}
