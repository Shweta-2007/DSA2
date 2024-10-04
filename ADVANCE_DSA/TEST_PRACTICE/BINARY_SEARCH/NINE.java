package DSA2.ADVANCE_DSA.TEST_PRACTICE.BINARY_SEARCH;

public class NINE {
    public static long gcd(long a, long b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public static int magicalNumber(int a, int b, int c) {
        long low = Math.min(a, b);
        long high = a * Math.min(a, b);
        long ans = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long count = mid / b + mid / c - mid / lcm(b, c);
            if (count == a) {
                ans = mid;
                high = mid - 1;
            } else if (count < a) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (int) ans;
    }

    public static void main(String[] args) {
        int A = 10, B = 5, C = 13;
        int ans = magicalNumber(A, B, C);
        System.out.println(ans);

    }
}
