package DSA2.ADVANCE_DSA.LEETCODE;

public class SEVEN {
    public static void isUgly(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                if (i != 2 || i != 3 || i != 5) {
                    System.out.println("not ugly");
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        int n = 6;
        isUgly(n);
    }
}
