package DSA2.ADVANCE_DSA.HASHMAP;

import java.util.*;

// Given an array A. You have some integers given in the array B. For the i-th number, find the frequency of B[i] in the array A and return a list containing all the frequencies.

public class four {
    public static void main(String[] args) {
        int[] A = { 1, 2, 1, 1 };
        int[] B = { 1, 2 };

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i]) == false) {
                map.put(A[i], 1);
            } else {
                int oldValue = map.get(A[i]);
                map.put(A[i], oldValue + 1);
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < B.length; i++) {
            if (map.containsKey(B[i]) == true) {
                int count = map.get(B[i]);
                result.add(count);
            } else {
                result.add(0);
            }
        }

        System.out.println(result);
    }
}
