package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING;

import java.util.*;

// Given an arr[N] and K. Check if there exists a pair(i,j) such that arr[i] + arr[j] = K and i != j
public class ELEVEN {
    public static void main(String[] args) {
        int arr[] = { 8, 9, 1, -2, 4, 5, 11, -6, 4 };
        int K = 6;
        boolean doesExist = false;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(K - arr[i])) {
                if (arr[i] == K - arr[i]) {
                    if (map.get(arr[i]) > 1) {
                        doesExist = true;
                        System.out.println("true");
                        break;
                    }
                } else {
                    doesExist = true;
                    System.out.println("true");
                    break;
                }

            }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        if (!doesExist) {
            System.out.println("false");
        }
    }
}
