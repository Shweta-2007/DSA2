package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING_NEW;

import java.util.*;

// return count of subarrays sum equal to k
public class SIX {
    public static int subarrayCount(int arr[], int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> psumMap = new HashMap<>();
        psumMap.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int compliment = sum - k;
            if (psumMap.containsKey(compliment)) {
                count += psumMap.get(compliment);
            }

            psumMap.put(sum, psumMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int k = 3;
        int ans = subarrayCount(arr, k);
        System.out.println(ans);
    }
}
