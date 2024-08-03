package DSA2.ADVANCE_DSA.BIT_MANIPULATION;

public class two {
    public static void main(String[] args) {
        int arr[] = { 4369, 8738, 349525 };
        int maxCount = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int number = arr[i];
            while (number > 0) {
                // check the last most bit
                if ((number & 1) == 1) {
                    count++;
                }
                // right shift the number
                number = (number >> 1);
            }

            maxCount = Math.max(maxCount, count);
        }

        System.out.println(maxCount);

    }
}
