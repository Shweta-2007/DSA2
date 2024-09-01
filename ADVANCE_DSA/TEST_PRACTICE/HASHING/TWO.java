package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING;

import java.util.*;

// Given N elements. Find first non repeating element
public class TWO {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 2, 5 };
        // create frequqnecy map
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        // iterate on all elements
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
