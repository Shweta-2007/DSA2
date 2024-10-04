package DSA2.ADVANCE_DSA.LEETCODE;

public class TWO {
    public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                sum = sum + i;

            }

        }

        if (sum == num) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int n = 7;
        boolean ans = checkPerfectNumber(n);
        System.out.println(ans);
    }
}
