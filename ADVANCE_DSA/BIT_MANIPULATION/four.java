package DSA2.ADVANCE_DSA.BIT_MANIPULATION;

// You are given two integers A and B.
// If B-th bit in A is set, make it unset.
// If B-th bit in A is unset, leave as it is.
// Return the updated A value.
public class four {
    public static void main(String[] args) {
        int A = 5;
        int B = 2;
        int mask = (1 << B);
        if ((A & mask) != 0) {
            // unset it
            A = A & ~mask;
        }
        System.out.println(A);
    }
}
