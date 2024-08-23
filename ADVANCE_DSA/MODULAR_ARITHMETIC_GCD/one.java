package DSA2.ADVANCE_DSA.MODULAR_ARITHMETIC_GCD;

//Given an array of integers A, calculate the sum of A [ i ] % A [ j ] for all possible i, j pairs. Return sum % (109 + 7) as an output.

//Problem Constraints: 1 <= length of the array A <= 10^5, 1 <= A[i] <= 10^3

public class one {
    public static void main(String[] args) {
        int arr[] = { 17, 100, 11 };
        long sum = 0;
        long mod = 100000007;
        int[] freq = new int[1001];

        // Count frequencies of each number in the array
        for (int x : arr) {
            freq[x]++;
        }

        // Calculate the sum of A[i] % A[j]
        for (int i = 1; i <= 1000; i++) {
            if (freq[i] == 0)
                continue;
            for (int j = 1; j <= 1000; j++) {
                sum += (long) (freq[i] * freq[j] * (i % j)) % mod;
                sum %= mod;
            }
        }

        int result = (int) sum;
        System.out.println(result);

    }
}
