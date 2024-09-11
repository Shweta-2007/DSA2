package DSA2.ADVANCE_DSA.TEST_PRACTICE.SORTING;

import java.util.*;

// comapre on the basis of string length, if same then leave as it was in question
public class TWELVE {
    public static String[] sort(String[] A) {
        Arrays.sort(A, new Comparator<String>() {
            public int compare(String a, String b) {
                if (a.length() == b.length()) {
                    // do not do anything
                    return 0;
                }

                return Integer.compare(a.length(), b.length());
            }

        });

        return A;
    }

    public static void main(String[] args) {
        String[] words = { "appple", "bat", "banana", "cat", "dog", "elephant" };
        String ans[] = sort(words);
        System.out.println(Arrays.toString(ans));
    }
}
