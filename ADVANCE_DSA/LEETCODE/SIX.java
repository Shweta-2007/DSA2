package DSA2.ADVANCE_DSA.LEETCODE;

import java.util.HashSet;

public class SIX {
    public static boolean isHappy(int n) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        while (n != 1 && !seenNumbers.contains(n)) {
            seenNumbers.add(n);
            n = getSumOfSqaures(n);
        }

        return n == 1;
    }

    public static int getSumOfSqaures(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 19;
        boolean ans = isHappy(n);
        System.out.println(ans);
    }
}
