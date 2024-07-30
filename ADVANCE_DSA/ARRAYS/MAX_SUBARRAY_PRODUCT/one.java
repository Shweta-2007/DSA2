package DSA2.ADVANCE_DSA.ARRAYS.MAX_SUBARRAY_PRODUCT;

// optimal approach
public class one {
    public static void main(String[] args) {
        int arr[] = { 1, 2, -3, 0, -4, -5 };
        int n = arr.length;
        int prefix = 1;
        int suffix = 1;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (prefix == 0)
                prefix = 1;
            if (suffix == 0)
                suffix = 1;

            prefix *= arr[i];
            suffix *= arr[n - i - 1];

            ans = Math.max(ans, Math.max(suffix, prefix));
        }

        System.out.println(ans);

    }
}
