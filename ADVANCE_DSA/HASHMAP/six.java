package DSA2.ADVANCE_DSA.HASHMAP;

import java.util.*;

// count of subarrays with sum = 0
public class six {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, -3, 4, 3, 1, -2, -3, 2, -5, 5 };
        HashMap<Integer, Integer> prefixSumFreqMap = new HashMap<Integer, Integer>();
        int sum = 0;
        int count = 0;

        // create map frequency of prefix sum
        for (int num : arr) {
            sum += num;
            // if it contains key then subarray sum will be 0
            if (prefixSumFreqMap.containsKey(sum)) {
                count += prefixSumFreqMap.get(sum);
            }

            prefixSumFreqMap.put(sum, prefixSumFreqMap.getOrDefault(sum, 0) + 1);

        }
        System.out.println(count);
    }
}
