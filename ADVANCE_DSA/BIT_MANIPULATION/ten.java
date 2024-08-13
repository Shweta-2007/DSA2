package DSA2.ADVANCE_DSA.BIT_MANIPULATION;

public class ten {
    // Given an array A, for every pair of indices i and j (i != j). Find the
    // maximum A[i] & A[j]
    public static void main(String[] args) {
        int arr[] = { 15, 7, 6 };
        int n = arr.length;
        int ans = 0;

        for (int i = 30; i >= 0; i--) {
            // count number of set bit for each position
            int count = 0;
            for (int j = 0; j < n; j++) {
                if ((arr[j] & (1 << i)) != 0) {
                    count++;
                }
            }

            // a pair can be formed if count >= 2
            if (count >= 2) {
                // set that bit of ans
                ans = (ans | (1 << i));
                // remove element if there bit is not set at i position
                for (int j = 0; j < n; j++) {
                    if ((arr[j] & (1 << i)) == 0) {
                        arr[j] = 0;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
