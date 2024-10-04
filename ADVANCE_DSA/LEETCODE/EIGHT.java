package DSA2.ADVANCE_DSA.LEETCODE;

import java.util.HashMap;

public class EIGHT {
    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ans = Integer.MIN_VALUE;

        for (int key : map.keySet()) {

            if (map.get(key) == key) {
                ans = Math.max(ans, key);

            }

        }

        if (ans != Integer.MIN_VALUE) {
            return ans;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 3, 3 };
        int ans = findLucky(arr);
        System.out.println(ans);
    }
}
