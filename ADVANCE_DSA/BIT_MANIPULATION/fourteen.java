package DSA2.ADVANCE_DSA.BIT_MANIPULATION;

// Given an integer A.Two numbers, X and Y, are defined as follows: X is the greatest number smaller than A such that the XOR sum of X and A is the same as the sum of X and A.Y is the smallest number greater than A, such that the XOR sum of Y and A is the same as the sum of Y and A.Find and return the XOR of X and Y.

public class fourteen {
    public static void main(String[] args) {
        int A = 5;
        int x = 0, y = 0, i = 0;
        while (A > 0) {
            if ((A & 1) == 0) {
                x = x | (1 << i);
            }

            A = A >> 1;
            i++;
        }

        y = 1 << i;
        System.out.println(x ^ y);

    }
}
