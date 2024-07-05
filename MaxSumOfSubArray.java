package DSA2;

public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int[] arr = { -3, 4, -2, 5, 3, -2, 8, 2, -1, 4 };
        int n = arr.length;
        int k = 5;
        int startIndex = 0;
        int endIndex = k - 1;
        int ans = 0;

        while (endIndex < n) {
            int sum = 0;
            for (k = startIndex; k <= endIndex; k++) {
                sum += arr[k];
            }

            ans = Math.max(ans, sum);

            startIndex++;
            endIndex++;
        }

        System.out.println(ans);

    }
}
