package DSA2.ADVANCE_DSA.STACKS;

import java.util.*;

// Given an array of size N. For every index i, find the nearest element which is smaller than ith element on the left hand side. If no smaller than return -1
public class FOUR {
    public static int[] Solve(int arr[]) {
        int N = arr.length;
        int ans[] = new int[N];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            // pop all the greater and equal elements
            while (stack.size() > 0 && stack.peek() >= arr[i]) {
                stack.pop();
            }

            // update ans
            if (stack.size() == 0) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }

            // add current element in stack
            stack.push(arr[i]);

        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 10, 11, 7, 8, 3, 5 };
        int result[] = Solve(arr);
        System.out.println(Arrays.toString(result));
    }
}