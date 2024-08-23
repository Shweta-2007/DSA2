package DSA2.ADVANCE_DSA.HASHMAP;

import java.util.*;

// Given N elements. Find the first non-repeating element.
public class two {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 2, 5 };
        int n = arr.length;

        // create frequency map
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i]) == false) {
                map.put(arr[i], 1);
            } else {
                int oldValue = map.get(arr[i]);
                map.put(arr[i], oldValue + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) == 1) {
                System.out.println(arr[i]);
                return;
            }
        }
    }
}
