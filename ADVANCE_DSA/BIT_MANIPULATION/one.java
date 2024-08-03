package DSA2.ADVANCE_DSA.BIT_MANIPULATION;

// Given an integer N. count the set bits in N.
public class one {
    public static void main(String[] args) {
        int N = 12;
        int count = 0;
        while (N > 0) {
            // check last bit of N
            if ((N & 1) == 1) {
                count++;
            }
            // right shift the number
            N = (N >> 1);
        }
        System.out.println(count);
    }
}