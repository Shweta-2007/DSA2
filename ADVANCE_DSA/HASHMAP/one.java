package DSA2.ADVANCE_DSA.HASHMAP;

import java.util.*;

//Given N elements & Q queries. Find the frequency of elements provided in the query.
public class one {
    public static void main(String[] args) {
        int arr[] = { 2, 6, 3, 8, 2, 8, 2, 3, 8, 10, 6 };
        int n = arr.length;
        int query[] = { 2, 8, 3, 5 };
        int q = query.length;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // create frequency map
        for (int i = 0; i < n; i++) {
            // if not in map then add with frequency 1
            if (map.containsKey(arr[i]) == false) {
                map.put(arr[i], 1);
            } else {
                int oldValue = map.get(arr[i]);
                map.put(arr[i], oldValue + 1);
            }
        }

        for (int i = 0; i < q; i++) {
            int element = query[i];
            if (map.containsKey(element) == false) {
                System.out.println("0");

            } else {
                int ans = map.get(element);
                System.out.println(ans);
            }
        }

    }
}