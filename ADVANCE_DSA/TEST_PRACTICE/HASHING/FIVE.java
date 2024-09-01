package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING;

import java.util.*;

// Count of subarrays with sum = 0
public class FIVE {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, -3, 4, 3, 1, -2, -3, 2 };
        int sum = 0;
        int count = 0;
        // create frequency map of prefix sum
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : arr) {
            sum += num;
            if (map.containsKey(sum)) {
                // we have to increase count
                count += map.get(sum);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }
        System.out.println(count);
    }
}
