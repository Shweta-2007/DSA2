package DSA2.ADVANCE_DSA.LEETCODE;

import java.util.HashMap;
import java.util.HashSet;

public class FIVE {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // iterate through values
        for (int key : map.values()) {
            set.add(key);
        }

        return map.size() == set.size();

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 1, 1, 3 };
        boolean ans = uniqueOccurrences(arr);
        System.out.println(ans);
    }
}
