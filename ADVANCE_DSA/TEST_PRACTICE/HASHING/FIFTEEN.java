package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING;

import java.util.*;

// You are given an array A of N integers and an integer B. Count the number of pairs(i,j) such that A[i] - A[j] = B abd i != j
public class FIFTEEN {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 2 };
        int B = 1;
        int count = 0;

        // Create frequency map on the go
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int compliment1 = arr[i] - B;
            int compliment2 = arr[i] + B;

            if (map.containsKey(compliment1)) {
                count += map.get(compliment1);
            }

            if (map.containsKey(compliment2)) {
                count += map.get(compliment2);
            }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println(count);
    }
}
