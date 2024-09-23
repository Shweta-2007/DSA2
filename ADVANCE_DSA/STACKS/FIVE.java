package DSA2.ADVANCE_DSA.STACKS;

import java.util.*;

// convert prefix to postfix
public class FIVE {
    public static String convert(String str) {
        // 1. reverse the given string
        String reversedString = new StringBuilder(str).reverse().toString();

        // 2. stack
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < reversedString.length(); i++) {
            char c = reversedString.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stack.push(Character.toString(c));
            } else if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                String expression = operand1 + operand2 + c;
                stack.push(expression);
            }

        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String str = "+/x^y*azb";
        String ans = convert(str);
        System.out.println(ans);
    }

}
