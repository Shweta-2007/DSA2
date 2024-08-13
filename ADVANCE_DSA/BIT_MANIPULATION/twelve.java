package DSA2.ADVANCE_DSA.BIT_MANIPULATION;

// You are given an array of integers A of size N.The value of a subarray is defined as BITWISE OR of all elements in it.Return the sum of value of all subarrays of A % 109 + 7.

public class twelve {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4 };
        int n = arr.length;
        long total = (long) n * (n + 1) / 2;
        long ans = 0;
        long mod = 1000000007;

        for (int i = 0; i < 31; i++) {
            int count = 0;
            long zeroVal = 0;
            for (int j = 0; j < n; j++) {
                if ((arr[j] & (1 << i)) == 0) {
                    count++;
                } else {
                    zeroVal += ((long) count * (count + 1) / 2);
                    count = 0;
                }
            }

            zeroVal += (long) count * (count + 1) / 2;
            ans += (total - zeroVal) * (1L << i);
            ans %= mod;
        }

        System.out.println(ans);
    }
}
