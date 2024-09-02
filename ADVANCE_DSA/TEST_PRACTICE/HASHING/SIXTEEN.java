package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING;

import java.util.*;

// Given an array A of N integers. Find the length of the longest subarray in the array which sums to zero. If there is no subarray which sums to zero the return 0.
public class SIXTEEN {
    public static void main(String[] args) {
        int arr[] = { 1, -2, 1, 2 };
        HashMap<Integer, Integer> pfHashMap = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        pfHashMap.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (pfHashMap.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - pfHashMap.get(sum));
            }
            pfHashMap.put(sum, i);
        }
        System.out.println(pfHashMap);

        System.out.println(maxLength);

    }
}
