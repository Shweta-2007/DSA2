package DSA2.ADVANCE_DSA.HASHMAP;

import java.util.*;

// Given an array and K. Check if there exists a pair (i,j) such that arr[i] + arr[j] = K && i != j
public class eight {
    public static void main(String[] args) {
        int arr[] = { 8, 9, 1, -2, 4, 5, 11, -6, 4 };
        int k = 22;

        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : arr) {
            // first search whether compliment exists in set or not then add num to set
            int compliment = k - num;
            if (set.contains(compliment)) {
                System.out.println("true");
                break;
            }
            set.add(num);
        }
        System.out.println("false");

    }
}
