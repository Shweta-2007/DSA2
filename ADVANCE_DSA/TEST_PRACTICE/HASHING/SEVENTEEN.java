package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING;

import java.util.*;
//Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.If the answer does not exist return an array with a single integer "-1".First sub-array means the sub-array for which starting index in minimum.

public class SEVENTEEN {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        // prefix sum: 1,3,6,10,15
        int B = 5;
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - B)) {
                int startIndex = map.get(sum - B) + 1;
                list.add(arr[startIndex]);
                list.add(arr[i]);
                System.out.println(list);
                return;
            }
            map.put(sum, i);
        }

        System.out.println(list);
    }
}
