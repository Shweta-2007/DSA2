package DSA2.ADVANCE_DSA.TEST_PRACTICE.STACKS;

import java.util.*;

// postfix
public class THREE {
    public static int postFix(String[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (String s : arr) {
            if (!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")) {
                stack.push(Integer.parseInt(s));
            } else {
                int op2 = stack.pop();
                int op1 = stack.pop();
                int ans = calc(op1, op2, s);
                stack.push(ans);
            }
        }

        return stack.pop();
    }

    public static int calc(int a, int b, String operation) {
        if (operation == "+") {
            return a + b;
        } else if (operation == "-") {
            return a - b;
        } else if (operation == "*") {
            return a * b;
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        String arr[] = { "3", "5", "+", "2", "-", "2", "5", "*", "-" };
        int ans = postFix(arr);
        System.out.println(ans);
    }
}
