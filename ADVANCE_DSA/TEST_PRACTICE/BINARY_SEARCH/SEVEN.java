package DSA2.ADVANCE_DSA.TEST_PRACTICE.BINARY_SEARCH;

// square root
public class SEVEN {
    public static int sqaureRoot(int n) {
        int low = 1;
        int high = n;
        int ans = 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid <= n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 100;
        int ans = sqaureRoot(n);
        System.out.println(ans);
    }
}
