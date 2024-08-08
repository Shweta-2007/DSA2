package DSA2.ADVANCE_DSA.RECURSION;

// Given a number A, we need to find the sum of its digits using recursion.
// input => 11, output => 1 + 1 = 2
public class one {
    public int find(int N) {

        // find all digits
        int digit = N % 10;
        int number = N / 10;
        if (N == 0) {
            return 0;
        }

        return digit + find(number);
    }

    public static void main(String[] args) {

    }
}