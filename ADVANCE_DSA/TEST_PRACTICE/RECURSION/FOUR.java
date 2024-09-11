package DSA2.ADVANCE_DSA.TEST_PRACTICE.RECURSION;

// factorial
public class FOUR {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = factorial(n);
        System.out.println(ans);
    }
}
