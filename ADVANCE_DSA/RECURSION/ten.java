package DSA2.ADVANCE_DSA.RECURSION;

//On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10. Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed.).

// A = 4, B = 4, 0 01 0110 01101001 => 4th index is 1, B = 01101001
public class ten {
    public static int findKthSymbol(int A, int B) {
        if (A == 0) {
            return 0;
        }

        int length = (int) Math.pow(2, A);
        int mid = length / 2;

        if (B < mid) {
            // if B is in first half
            return findKthSymbol(A - 1, B);
        } else {
            // if B is in second half
            return 1 - findKthSymbol(A - 1, B - mid);
        }
    }

    public static void main(String[] args) {
        int A = 4, B = 4;
        int result = findKthSymbol(A, B);
        System.out.println(result);
    }
}
