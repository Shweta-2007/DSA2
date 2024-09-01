package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING;

import java.util.*;

// count of distinct elements
public class THREE {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 3, 4 };
        // create hash set and return its length
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int ans = set.size();
        System.out.println(ans);
    }
}
