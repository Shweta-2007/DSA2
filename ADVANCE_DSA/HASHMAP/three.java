package DSA2.ADVANCE_DSA.HASHMAP;

import java.util.*;

// Count of unique elements 
public class three {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 5, 4 };
        int n = arr.length;

        // create hash set
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        int ans = set.size();
        System.out.println(ans);

    }
}
