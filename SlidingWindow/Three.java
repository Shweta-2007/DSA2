package DSA2.SlidingWindow;

// Given an array of positive integers nums and a positive integer target, find the minimum length of a contiguous subarray of which the sum is greater than or equal to target. If there is no such subarray, return 0.
public class Three {
    public static void main(String[] args) {
        int nums[] = { 2, 3, 1, 2, 4, 3 };
        int n = nums.length;
        int target = 7;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        int left = 0;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum >= target) {
                int length = right - left + 1;
                if (length < minLength) {
                    minLength = length;
                }
                sum = sum - nums[left++];
            }
        }

        System.out.println(minLength);
    }
}
