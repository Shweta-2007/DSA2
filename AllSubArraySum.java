package DSA2;

public class AllSubArraySum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int n = arr.length;
        int ans = 0;
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                }
                ans += sum;
            }
        }
        System.out.println(ans);
    }

}
