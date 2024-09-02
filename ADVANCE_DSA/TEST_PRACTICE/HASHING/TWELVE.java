package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING;

import java.util.*;

// Count number of pairs wuth sum = K
public class TWELVE {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 2, 1, 2 };
        int K = 3;
        int count = 0;
        // frequency map on the go
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            int compliment = K - arr[i];
            if (map.containsKey(compliment)) {
                count += map.get(compliment);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(count);
    }
}
