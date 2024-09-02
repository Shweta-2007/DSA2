package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING;

import java.util.*;
//Given an array A. You have some integers given in the array B.For the i-th number, find the frequency of B[i] in the array A and return a list containing all the frequencies.

public class SIX {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 1 };
        int B[] = { 1, 2 };
        List<Integer> result = new ArrayList<>();
        // calculate frequency map
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // iterate on every query
        for (int i = 0; i < B.length; i++) {
            if (map.containsKey(B[i])) {
                result.add(map.getOrDefault(B[i], 0));
            }
        }

        System.out.println(result);
    }
}
