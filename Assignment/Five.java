package DSA2.Assignment;

public class Five {
    public static void main(String[] args) {
        // int arr[] = { 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 };
        int arr[] = { 1, 1, 1, 0, 1, 1, 1, 0, 1 };
        int ans = 0;

        int totalOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                totalOnes++;
            }
        }

        if (totalOnes == 0) {
            System.out.println("0");
            return;
        }

        if (totalOnes == arr.length) {
            System.out.println(arr.length);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                // count left 1s
                int leftCount = 0;
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] == 1) {
                        leftCount++;
                    } else {
                        break;
                    }
                }

                // count right 1s
                int rightCount = 0;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == 1) {
                        rightCount++;
                    } else {
                        break;
                    }
                }

                ans = Math.max(ans, rightCount + leftCount + 1);
            }
        }

        // Handle the case where there are contiguous 1s at the edges without any 0 in
        // between
        ans = Math.min(ans, totalOnes); // Ensure not exceeding the total number of 1s

        System.out.println(ans);
    }
}
