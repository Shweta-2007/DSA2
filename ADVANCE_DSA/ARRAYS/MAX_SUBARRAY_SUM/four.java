package DSA2.ADVANCE_DSA.ARRAYS.MAX_SUBARRAY_SUM;

// Given arr[N]. Find the max subarray sum out of all subarrays

// idea 2: using kadane's algorithm => carry forward only when sum is positive

// T.C => O(N)  S.C => O(1)
public class four {
    public static void main(String[] args) {
        int arr[] = { -3, 2, 4, -1, 3, -4, 3 };
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            ans = Math.max(ans, sum);
            if (sum < 0) {
                sum = 0;
            }

        }

        System.out.println("ans:" + ans);
    }

}