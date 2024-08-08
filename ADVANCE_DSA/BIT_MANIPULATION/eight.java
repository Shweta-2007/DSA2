package DSA2.ADVANCE_DSA.BIT_MANIPULATION;

// Given an array A, for every pair of indices i and j (i != j). Find the maximum A[i] & A[j]
// method - 1 => consider all pairs
public class eight {
    public static void main(String[] args) {
        int A[] = { 27, 18, 20 };
        int n = A.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                ans = Math.max(ans, A[i] & A[j]);
            }
        }
        System.out.println(ans);
    }
}
