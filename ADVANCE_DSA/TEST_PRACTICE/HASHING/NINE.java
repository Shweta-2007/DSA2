package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING;

import java.util.*;
//Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array. NOTE:Each element in the result should appear as many times as it appears in both arrays.The result can be in any order.

public class NINE {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 2, 1 };
        int arr2[] = { 2, 3, 1, 2 };
        // List to store result
        List<Integer> list = new ArrayList<>();

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            map1.put(arr1[i], map1.getOrDefault(arr1[i], 0) + 1);
        }

        for (int i = 0; i < arr2.length; i++) {
            map2.put(arr2[i], map2.getOrDefault(arr2[i], 0) + 1);
        }

        for (int a : map1.keySet()) {
            if (map2.containsKey(a)) {
                // find the minimum frequency
                int count = Math.min(map2.get(a), map1.get(a));
                // add this element to the number of count
                for (int i = 0; i < count; i++) {
                    list.add(a);
                }
            }
        }

        // convert List to array
        int resultArray[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            resultArray[i] = list.get(i);
        }

        System.out.println(Arrays.toString(resultArray));

    }
}
