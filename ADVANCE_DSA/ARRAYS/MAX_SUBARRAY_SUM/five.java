package DSA2.ADVANCE_DSA.ARRAYS.MAX_SUBARRAY_SUM;

// maximum subarray sum
public class five {
    public static void main(String[] args) {
        int arr[] = { -2, 3, 4, -1, 5, -10, 7 };
        int n = arr.length;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            currentSum = currentSum + arr[i];
            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println(maxSum);
    }
}
