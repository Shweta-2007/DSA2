package DSA2.ADVANCE_DSA.ARRAYS.RAIN_WATER_TRAPPED;

public class two {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 2, 1, 2, 4, 3, 2, 1, 3, 1 };
        int n = arr.length;
        int rainWaterTrapped = 0;

        // left maximum
        for (int i = 0; i < n; i++) {
            int lmax = 0;
            for (int j = 0; j <= i; j++) {
                lmax = Math.max(lmax, arr[j]);
            }

            // right maximum
            int rmax = 0;
            for (int j = i; j < n; j++) {
                rmax = Math.max(rmax, arr[j]);
            }

            rainWaterTrapped += Math.min(lmax, rmax) - arr[i];
        }

        System.out.println(rainWaterTrapped);
    }
}
