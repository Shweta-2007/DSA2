package DSA2.ADVANCE_DSA.SORTING;

import java.util.*;

public class thirteen {
    public static String largestNumber(List<Integer> A) {
        Collections.sort(A, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                String XY = a.toString() + b.toString();
                String YX = b.toString() + a.toString();

                // compare both strings
                return XY.compareTo(YX);
            }
        });

        // build the largest integer
        StringBuilder ans = new StringBuilder();
        for (int x : A) {
            ans.append(x);
        }

        // If ans contains all 0
        if (ans.charAt(0) == '0') {
            return "0";
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(3, 34, 30, 5, 9);
        String s = largestNumber(A);
        System.out.println(s);
    }
}
