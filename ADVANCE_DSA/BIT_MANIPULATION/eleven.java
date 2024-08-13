package DSA2.ADVANCE_DSA.BIT_MANIPULATION;

// You are given an array of length of integers A of size N. The value of a subarray is defined as BITWISE OR of all elements in it. Return the sum of value of all subarrays of A % 10^9 + 7

// approach 1
public class eleven {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4 };
        int n = arr.length;
        int ans = 0;

        // consider all subarrays
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // calculate or of all subarrays
                int value = 0;
                for (int k = i; k <= j; k++) {
                    value = (value | arr[k]);
                }
                System.out.print(value + " ");
                ans += value;
            }
        }
        System.out.println();
        System.out.println(ans);

    }
}
