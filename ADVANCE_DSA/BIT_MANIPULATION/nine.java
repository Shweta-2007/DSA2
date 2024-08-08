package DSA2.ADVANCE_DSA.BIT_MANIPULATION;

// Given an array A, for every pair of indices i and j (i != j). Find the maximum A[i] & A[j]
// method 2 using bit manipulation
public class nine {
    public static void main(String[] args) {
        int A[] = { 27, 18, 20 };
        int n = A.length;
        int ans = 0;

        for (int i = 30; i >= 0; i--) {
            // count no of set bits at i-th position
            int count = 0;
            for (int j = 0; j < n; j++) {
                if ((A[j] & (1 << i)) != 0) {
                    count++;
                }
            }

            if (count >= 2) {
                // a pair can be selected which have ith bit as 1
                ans = (ans | (1 << i));
                for (int j = 0; j < n; j++) {
                    if ((A[j] & (1 << j)) == 0) {
                        A[j] = 0;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
