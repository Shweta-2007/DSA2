package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING;

import java.util.*;
//Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.If the given array contains a sub-array with sum zero return 1, else return 0.

public class EIGHT {
    public static void main(String[] args) {
        int arr[] = { 4, -1, 1 };
        int sum = 0;
        boolean isPresent = false;
        // create frequency map of prefix sum
        HashMap<Integer, Integer> fmap = new HashMap<>();
        for (int num : arr) {
            sum += num;
            fmap.put(sum, fmap.getOrDefault(sum, 0) + 1);
            if (sum == 0 || fmap.get(sum) > 1) {
                isPresent = true;
                System.out.println("1");
                break;
            }
        }

        if (!isPresent) {
            System.out.println("0");
        }

    }
}
