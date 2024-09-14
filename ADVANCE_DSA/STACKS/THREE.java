package DSA2.ADVANCE_DSA.STACKS;

//An arithmetic expression is given by a string array A of size N. Evaluate the value of an arithmetic expression in Reverse Polish Notation. Valid operators are +, -, *, /. Each string may be an integer or an operator.Note: Reverse Polish Notation is equivalent to Postfix Expression, where operators are written after their operands.
import java.util.*;

public class THREE {
    public static int Solve(String[] elements) {
        Stack<Integer> stack = new Stack<>();
        for (String element : elements) {
            if (element == "+" || element == "-" || element == "*" || element == "/") {

                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int ans = Calculator(operand1, operand2, element);
                stack.push(ans);

            } else {
                stack.push(Integer.parseInt(element));
            }
        }
        return stack.pop();
    }

    public static int Calculator(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;

            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        String[] A = { "2", "1", "+", "3", "*" };
        int ans = Solve(A);
        System.out.println(ans);
    }
}
