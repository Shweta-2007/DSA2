package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING;

import java.util.*;

// Given an array of N elements. Check if there exists a subarray with sum equal to 0
public class FOUR {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, -3, 4, 3, 1, -2, -3, 2 };
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            sum += num;

            if (sum == 0 || set.contains(sum)) {
                System.out.println("true");
                break;
            }

            set.add(sum);
        }
    }
}
