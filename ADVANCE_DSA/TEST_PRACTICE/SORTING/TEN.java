package DSA2.ADVANCE_DSA.TEST_PRACTICE.SORTING;

import java.util.*;

// Given a list of non - negative numbers, arrange them such that they form the largest number and return it, answer has to be string
public class TEN {
    public static void CompareFunction(int arr[]) {
        Integer newArr[] = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        Arrays.sort(newArr, (a, b) -> {
            String num1 = a.toString() + b.toString();
            String num2 = b.toString() + a.toString();
            return num2.compareTo(num1); // sort in descending order
        });

        // build the final result string
        StringBuilder ans = new StringBuilder();
        for (int num : newArr) {
            ans.append(num);
        }

        if (ans.charAt(0) == '0') {
            ans.append("0");
        }

        System.out.println(ans.toString());
    }

    public static void main(String[] args) {
        int arr[] = { 3, 30, 34, 5, 9 };
        CompareFunction(arr);
    }
}
