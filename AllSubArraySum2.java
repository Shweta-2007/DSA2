package DSA2;

public class AllSubArraySum2 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int n = arr.length;
        int ans = 0;
        // PREFIX SUM
        int pSum[] = new int[n];
        pSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pSum[i] = pSum[i - 1] + arr[i];
        }
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int sum = 0;
                if (start == 0) {
                    sum = pSum[end];
                } else {
                    sum = pSum[end] - pSum[start - 1];
                }
                ans += sum;
            }
        }
        System.out.println(ans);
    }
}
