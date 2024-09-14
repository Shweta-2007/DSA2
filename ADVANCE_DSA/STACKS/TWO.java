package DSA2.ADVANCE_DSA.STACKS;

import java.util.*;

// Given a string str. Remove equal pair of consecutive elements till possible. Return the strings without adjacent duplicates
public class TWO {
    public static String Solve(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                // remove the character from stack
                stack.pop();
            } else {
                // add in stack
                stack.push(c);
            }
        }

        StringBuilder ans = new StringBuilder();
        for (char c : stack) {
            ans.append(c);
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String str1 = "abbaca";
        String ans = Solve(str1);
        System.out.println(ans);
    }

}
