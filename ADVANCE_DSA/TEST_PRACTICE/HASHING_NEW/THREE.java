package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING_NEW;

import java.util.*;

// Union of two arrays
public class THREE {
    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        HashSet<Integer> set = new HashSet<>();

        // List<Integer> list = new ArrayList<>();

        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }

        // System.out.println(set.size());
        for (int el : set) {
            System.out.print(el + " ");
        }

    }
}
