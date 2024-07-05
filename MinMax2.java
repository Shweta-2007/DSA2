package DSA2;

public class MinMax2 {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 6, 4, 5, 1, 5, 2, 6, 4, 1 };
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Find max and min in the array
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        int maxIndex = -1;
        int minIndex = -1;
        int result = n;
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                maxIndex = i;
                if (minIndex != -1) {
                    result = Math.min(result, maxIndex - minIndex + 1);
                }
            } else if (arr[i] == min) {
                minIndex = i;
                if (minIndex != -1) {
                    result = Math.min(result, minIndex - maxIndex + 1);
                }
            }
        }
        System.out.println(result);
    }
}
