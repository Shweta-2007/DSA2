package DSA2;

public class AllSubArraySum3 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int n = arr.length;
        int ans = 0;

        // CONTRIBUTION TECHNIQUE
        for (int i = 0; i < n; i++) {
            ans += arr[i] * (i + 1) * (n - i);
        }

        System.out.println(ans);
    }
}
