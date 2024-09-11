package DSA2.ADVANCE_DSA.TEST_PRACTICE.RECURSION;

// sum of first n natural numbers
public class FIVE {
    public static int sum(int n) {
        if (n < 1) {
            return 0;
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        int ans = sum(n);
        System.out.println(ans);
    }
}
