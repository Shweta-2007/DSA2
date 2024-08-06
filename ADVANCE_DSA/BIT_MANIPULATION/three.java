package DSA2.ADVANCE_DSA.BIT_MANIPULATION;

// You are given two integers A and B.
// Set the A-th bit and B-th bit in 0, and return output in decimal Number System.
public class three {
    public static void main(String[] args) {
        int A = 3;
        int B = 5;
        int result = 0;
        result = result | (1 << A);
        result = result | (1 << B);
        System.out.println(result);
    }
}