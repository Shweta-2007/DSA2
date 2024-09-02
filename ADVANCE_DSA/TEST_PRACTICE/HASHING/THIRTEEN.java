package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING;

import java.util.*;

// Subarray with sum K
public class THIRTEEN {
    public static void main(String[] args) {
        int arr[] = { 5, 10, 20, 100, 105 };
        int K = 110;
        int sum = 0;
        boolean isPresent = false;
        HashMap<Integer, Integer> pfSumMap = new HashMap<>();
        // on the go
        pfSumMap.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (pfSumMap.containsKey(sum - K)) {
                System.out.println("true");
                isPresent = true;
                break;
            }
            pfSumMap.put(sum, pfSumMap.getOrDefault(sum, 0) + 1);
        }

        if (!isPresent) {
            System.out.println("false");
        }

    }
}
