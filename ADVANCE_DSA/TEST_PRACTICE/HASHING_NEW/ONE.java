package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING_NEW;

import java.util.*;

// Given an array of integers nums and target, return the indices of the two numbers such that they add up to target, You may assume that each input will have exactly one solution and you may not use same element twice.
public class ONE {
    public static int[] Index(int arr[], int target) {
        int result[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        // hash map on the go
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {

                result[0] = i;
                result[1] = map.get(target - arr[i]);
                return result;
            }

            map.put(arr[i], i);
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 9;
        // output should be [0,1] in this case, it can be in any order
        int ans[] = Index(nums, target);
        System.out.println(Arrays.toString(ans));
    }
}
