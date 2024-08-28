package DSA2.ADVANCE_DSA.HASHMAP;

import java.util.*;

// Given an array and K. Check if there exists a pair (i,j) such that arr[i] + arr[j] = K && i != j
public class seven {
    public static void main(String[] args) {
        int arr[] = { 8, 9, 1, -2, 4, 5, 11, -6, 4 };
        int k = 8;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // create frequency map
        for (int num : arr) {
            int currentCount = map.getOrDefault(num, 0);
            map.put(num, currentCount + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(k - arr[i]) == true) {
                if (arr[i] != k - arr[i]) {
                    System.out.println("true");
                    break;
                } else {
                    if (map.get(arr[i]) >= 2) {
                        System.out.println("true");
                        break;
                    }
                }
            }
        }

        System.out.println("false");

    }
}
