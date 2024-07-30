package DSA2.ADVANCE_DSA.ARRAYS.TEST;

public class one {
    public static void main(String[] args) {
        int A[] = { 6, 9, 18, 5, 27 };
        int n = A.length;
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                boolean allDivisibleBy9 = true;
                for (int k = i; k <= j; k++) {
                    if (A[k] % 9 != 0) {
                        allDivisibleBy9 = false;
                        break;
                    }
                }

                if (allDivisibleBy9) {
                    int length = j - i + 1;
                    maxLength = Math.max(maxLength, length);
                }
            }
        }

        System.out.println(maxLength);
    }
}
