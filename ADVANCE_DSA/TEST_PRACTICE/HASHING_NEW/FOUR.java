package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING_NEW;

import java.util.*;

// intersection of two arrays
public class FOUR {
    public static int Intersection(int arr1[], int arr2[]) {
        int count = 0;
        // 1. Create hash set for first array
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }

        // 2. loop over arr2 and find if it is present in set or not
        for (int num : arr2) {
            if (set.contains(num)) {
                count++;
                set.remove(num);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6 };
        int arr2[] = { 3, 4, 5, 6, 7, 8 };
        int ans = Intersection(arr1, arr2);
        System.out.println(ans);
    }
}
