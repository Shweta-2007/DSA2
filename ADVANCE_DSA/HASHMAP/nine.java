package DSA2.ADVANCE_DSA.HASHMAP;

import java.util.*;

// Count number of pairs with sum = k
public class nine {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 2, 1, 2 };
        int k = 3;
        int count = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : arr) {
            int compliment = k - num;
            if (set.contains(compliment)) {
                count++;
            }

            set.add(num);

        }
        System.out.println(count);
    }
}
