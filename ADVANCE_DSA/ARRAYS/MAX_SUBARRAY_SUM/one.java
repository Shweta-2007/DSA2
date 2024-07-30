package DSA2.ADVANCE_DSA.ARRAYS.MAX_SUBARRAY_SUM;

// Given arr[N]. Find the max subarray sum out of all subarrays

// T.C => O(N^3)  S.C => O(1)
public class one {
    public static void main(String[] args) {
        int arr[] = { -3, 2, 4, -1, 3, -4, 3 };
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    ans = Math.max(ans, sum);
                }
            }

        }

        System.out.println("ans:" + ans);
    }
}