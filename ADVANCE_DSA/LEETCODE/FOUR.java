package DSA2.ADVANCE_DSA.LEETCODE;

import java.util.*;

public class FOUR {
    public static int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set1 = new HashSet<>();

        for (char ch : jewels.toCharArray()) {
            set1.add(ch);
        }

        int count = 0;
        for (char ch : stones.toCharArray()) {
            if (set1.contains(ch)) {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int ans = numJewelsInStones(jewels, stones);
        System.out.println(ans);
    }
}
