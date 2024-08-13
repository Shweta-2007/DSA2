package DSA2.ADVANCE_DSA.RECURSION;

// Given a number A, check if it is a magic number or not.
// A number is said to be a magic number if the sum of its digits is calculated till a single digit recursively by adding the sum of the digits after every addition. If the single digit comes out to be 1, then the number is a magic number.
public class seven {
    public static int sumOfDigits(int n) {
        if (n == 0)
            return 0;
        return n % 10 + sumOfDigits(n / 10);
    }

    public static boolean isMagicNumber(int n) {
        if (n < 10) {
            return n == 0;
        }
        int sum = sumOfDigits(n);
        return isMagicNumber(sum);
    }

    public static void main(String[] args) {
        int n = 1;
        if (isMagicNumber(n)) {
            System.out.println(n + " is a magic number.");
        } else {
            System.out.println(n + " is not a magic number.");
        }
    }
}
