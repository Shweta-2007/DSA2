package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING;

import java.util.*;

//Given an array A of N integers. Find the count of the subarrays in the array which sums to zero. Since the answer can be very large, return the remainder on dividing the result with 109+7

public class TEN {
    public static void main(String[] args) {
        int arr[] = { -1, 2, -1 };
        int count = 0;
        int sum = 0;
        int mod = 1000000007;
        HashMap<Integer, Integer> fmap = new HashMap<>();
        fmap.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (fmap.containsKey(sum)) {
                count = (count + fmap.get(sum)) % mod;
            }
            fmap.put(sum, fmap.getOrDefault(sum, 0) + 1);
        }
        System.out.println(count);
    }

}
