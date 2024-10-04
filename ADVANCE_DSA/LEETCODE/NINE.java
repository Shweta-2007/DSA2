package DSA2.ADVANCE_DSA.LEETCODE;

public class NINE {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count = 0;

            } else {
                count++;
                ans = Math.max(ans, count);

            }

        }

        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 1, 0, 1 };
        int result = findMaxConsecutiveOnes(arr);
        System.out.println(result);

    }
}
