package DSA2.ADVANCE_DSA.TEST_PRACTICE.STACKS;

import java.util.*;

public class TWO {
    public static String doubleCharacterTrouble(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } else if (stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        String ans = "";
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }

        String result = new StringBuilder(ans).reverse().toString();
        return result;
    }

    public static void main(String[] args) {
        String s = "abccbde";
        String ans = doubleCharacterTrouble(s);
        System.out.println(ans);
    }
}
