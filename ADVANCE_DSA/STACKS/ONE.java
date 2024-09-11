package DSA2.ADVANCE_DSA.STACKS;

import java.util.*;

// Check whether the given sequence of parenthesis [], {}, () is valid or not?
public class ONE {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                // push it into stack
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;
                char top = stack.pop();
                if ((c == ']' && top != '[') ||
                        (c == '}' && top != '{') ||
                        (c == ')' && top != '(')) {
                    return false;
                }

            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([{}()])";
        boolean result = isValid(s);
        System.out.println(result);
    }

}
