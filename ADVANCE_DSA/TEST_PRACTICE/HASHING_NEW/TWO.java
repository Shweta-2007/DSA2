package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING_NEW;

import java.util.*;

// Given an integer array of size n, find all elements that appear more than   n / 3 times
public class TWO {
    public static List<Integer> Solve(int arr[]) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                list.add(key);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        List<Integer> ans = Solve(arr);
        System.out.println(ans);

    }
}