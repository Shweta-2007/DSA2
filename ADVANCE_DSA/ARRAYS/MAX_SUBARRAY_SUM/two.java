package DSA2.ADVANCE_DSA.ARRAYS.MAX_SUBARRAY_SUM;

// Given arr[N]. Find the max subarray sum out of all subarrays

// idea 2: using prefix sum

// T.C => O(N^2)  S.C => O(n)
public class two {
    public static void main(String[] args) {
        int arr[] = { -3, 2, 4, -1, 3, -4, 3 };
        int n = arr.length;
        int ans = Integer.MIN_VALUE;

        int pSum[] = new int[n];
        pSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pSum[i] = pSum[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                if (i == 0) {
                    sum = pSum[j];
                } else {
                    sum = pSum[j] - pSum[i - 1];
                }

                ans = Math.max(ans, sum);
            }
        }

        System.out.println("ans:" + ans);
    }

}