package DSA2.ADVANCE_DSA.ARRAYS.RAIN_WATER_TRAPPED;

public class one {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 2, 1, 2, 4, 3, 2, 1, 3, 1 };
        int n = arr.length;
        int waterTrapped = 0;

        for (int i = 0; i < n; i++) {
            // left maximum
            int leftMax = 0;
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, arr[j]);
            }

            // right maximum
            int rightMax = 0;
            for (int j = i; j < n; j++) {
                rightMax = Math.max(rightMax, arr[j]);
            }

            waterTrapped += Math.min(leftMax, rightMax) - arr[i];
        }
        System.out.println(waterTrapped);
    }
}