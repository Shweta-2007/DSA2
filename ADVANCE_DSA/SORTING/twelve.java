package DSA2.ADVANCE_DSA.SORTING;

import java.util.*;

public class twelve {
    public static String largestNumber(List<Integer> A) {
        Collections.sort(A, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                // Convert both integers to string
                String XY = a.toString() + b.toString();
                String YX = b.toString() + a.toString();

                // Compare the two strings by their concatenated value
                return YX.compareTo(XY); // Sort in descending order
            }
        });

        // Build the final largest number string
        StringBuilder ans = new StringBuilder();
        for (int x : A) {
            ans.append(x);
        }

        // Edge case: if the largest number is "0", return "0"
        if (ans.charAt(0) == '0') {
            return "0";
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(3, 34, 30, 5, 9);
        String s = largestNumber(A);
        System.out.println(s); // Output: 9534330
    }
}
