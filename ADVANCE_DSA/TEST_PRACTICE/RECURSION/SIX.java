package DSA2.ADVANCE_DSA.TEST_PRACTICE.RECURSION;

// sum of digits
public class SIX {
    public static int digitsSum(int n) {
        if (n == 0) {
            return 0;
        }

        // f(n) = digit + f(n / 10)
        return (n % 10) + digitsSum(n / 10);
    }

    public static void main(String[] args) {
        int n = 1342;
        int ans = digitsSum(n);
        System.out.println(ans);

    }
}
