package DSA2.ADVANCE_DSA.BIT_MANIPULATION;

public class five {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 6, 3, 6, 2, 5, 7 };
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            // find the count of set bits at i-th bit position
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if ((arr[j] & (1 << i)) != 0) {
                    count++;
                }
            }

            if (count % 2 != 0) {
                // set that bit
                ans = (ans | (1 << i));
            }
        }

        System.out.println(ans);
    }
}
