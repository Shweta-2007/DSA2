package DSA2.ADVANCE_DSA.TEST_PRACTICE.BINARY_SEARCH;

public class EIGHT {
    public static int magicalNumber(int A, int B, int C) {
        int count = 0;
        for (int i = Math.min(B, C); i <= A * Math.min(B, C); i++) {
            if (i % B == 0 || i % C == 0) {
                count++;
            }
            if (count == A) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int A = 10, B = 5, C = 13;
        int ans = magicalNumber(A, B, C);
        System.out.println(ans);

    }
}
