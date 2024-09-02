package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING;

import java.util.*;
//Given an integer array A of size N, find the first repeating element in it.We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.If there is no repeating element, return -1.

public class SEVEN {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 3, 4, 3, 5, 6 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }

        for (int i = 0; i < arr.length; i++) {

            if (map.get(arr[i]) > 1) {
                System.out.println(arr[i]);
                break;
            }

        }

    }
}
