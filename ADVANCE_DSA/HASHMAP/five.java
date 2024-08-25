package DSA2.ADVANCE_DSA.HASHMAP;

import java.util.*;

//Given an array of n elements. check if there exists a subarray with sum equal to 0
public class five {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, -3, 4, 3, 1, -2, -3, 2 };
        HashSet<Integer> set = new HashSet<Integer>();
        int sum = 0;
        for (int num : arr) {
            sum += num;

            if (sum == 0 || set.contains(sum)) {
                System.out.println("true");
                return;
            }

            set.add(sum);
        }
        System.out.println("false");
    }
}
