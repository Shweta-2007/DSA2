package DSA2.ADVANCE_DSA.RECURSION;

// Implement pow(A, B) % C.
// In other words, given A, B and C, Find (A ^ B % C).
// Note: The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.
public class six {
    public static int getPower(int A, int B, int C) {
        if (B == 0)
            return 1 % C;
        long halfPower = getPower(A, B / 2, C);
        halfPower = (halfPower * halfPower) % C;
        if (B % 2 != 0) {
            halfPower = (halfPower * A) % C;
        }
        if (halfPower < 0) {
            halfPower = (halfPower + C) % C;
        }

        return (int) halfPower;
    }

    public static void main(String[] args) {
        int result = getPower(71045970, 41535484, 64735492);
        System.out.println(result);

    }
}
