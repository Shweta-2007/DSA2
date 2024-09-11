package DSA2.ADVANCE_DSA.TEST_PRACTICE.HASHING_NEW;

import java.util.*;

// Given a string A consisting only of lowercase characters. You can swap any two characters of the string A any number of times. You have to check whether it is possible to convert the string A to a pallindrome string. Return 1 if possible otherwise 0;
public class SEVEN {
    public static int isPallindrome(String A) {
        // for odd length string: atmost one character has odd count
        // for even length string: all characters have even counts
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : A.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // count the number of character with odd frequencies
        int oddCount = 0;
        for (char key : map.keySet()) {
            if (map.get(key) % 2 == 1) {
                oddCount++;
            }
        }

        if (oddCount > 1) {
            return 0;
        }

        return 1;

    }

    public static void main(String[] args) {
        String A = "happy";
        int ans = isPallindrome(A);
        System.out.println(ans);

    }
}
