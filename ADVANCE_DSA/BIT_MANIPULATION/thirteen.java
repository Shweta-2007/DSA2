package DSA2.ADVANCE_DSA.BIT_MANIPULATION;

// Given N positive elements. Calculate sum of XOR of all pairs.
public class thirteen {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 5 };
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < 31; i++) {
            // find count of set bits at i-th position
            int count = 0;
            for (int j = 0; j < n; j++) {
                if ((arr[j] & (1 << i)) != 0) {
                    count++;

                }
            }

            sum += (1 << i) * count * (n - count);

        }
        System.out.println(sum);

    }
}
