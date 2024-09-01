package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING;

import java.util.*;

// Given n elements & Q queries. Find the frequency of elements provided in the query
public class ONE {
    public static void main(String[] args) {
        int arr[] = { 2, 6, 3, 8, 2, 8, 2, 3, 8, 10, 6 };
        int Q[] = { 2, 8, 3, 5 };

        // create hash map to store frequency of each element
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        // for each query check in the map
        for (int i = 0; i < Q.length; i++) {
            if (!map.containsKey(Q[i])) {
                System.out.println("0");
            } else {
                int value = map.get(Q[i]);
                System.out.println(value);
            }
        }
    }
}