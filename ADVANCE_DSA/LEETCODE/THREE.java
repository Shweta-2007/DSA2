package DSA2.ADVANCE_DSA.LEETCODE;

import java.util.*;

public class THREE {
    public static List<String> keyBoardRows(String[] words) {
        Set<Character> set1 = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
        Set<Character> set2 = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
        Set<Character> set3 = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));

        List<String> result = new ArrayList<>();
        for (String word : words) {
            String lowercasedWord = word.toLowerCase();

            if (canBePresentInOneRow(lowercasedWord, set1) || canBePresentInOneRow(lowercasedWord, set2)
                    || canBePresentInOneRow(lowercasedWord, set3)) {
                result.add(word);
            }
        }

        return result;

    }

    public static boolean canBePresentInOneRow(String word, Set<Character> set) {
        for (char ch : word.toCharArray()) {
            if (!set.contains(ch)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String words[] = { "Hello", "Alaska", "Dad", "Peace" };
        List<String> ans = keyBoardRows(words);
        System.out.println(ans);
    }
}
