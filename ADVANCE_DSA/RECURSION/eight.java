package DSA2.ADVANCE_DSA.RECURSION;

import java.util.Arrays;

//given an array of integers A with N elements and a target integer b, the task is to find all indices at which B occurs in the array, it is guaranteed that target exists at least once, recursive java code
public class eight {
    public static int[] findIndices(int[] arr, int index, int B, int count) {
        if (index == arr.length) {
            return new int[count];
        }

        if (arr[index] == B) {
            int[] result = findIndices(arr, index + 1, B, count + 1);
            result[count] = index;
            return result;
        } else {
            return findIndices(arr, index + 1, B, count);
        }
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 2, 5, 2, 6 };
        int B = 2;
        int indices[] = findIndices(A, 0, B, 0);
        System.out.println(Arrays.toString(indices));
    }

}
