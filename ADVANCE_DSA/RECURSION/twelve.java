package DSA2.ADVANCE_DSA.RECURSION;

//You are given an array A of size N. Write a recursive function that returns the last index at which an integer B is found in the array.NOTE: If B is not found anywhere in the array then return -1.

public class twelve {
    public static int lastIndex(int arr[], int idx, int target) {
        if (idx == -1) {
            return -1;
        }

        if (arr[idx] == target) {
            return idx;
        }

        return lastIndex(arr, idx - 1, target);
    }

    public static void main(String[] args) {
        int arr[] = { 6, 5, 6, 2 };
        int target = 6;
        int result = lastIndex(arr, arr.length - 1, target);
        System.out.println(result);

    }

}
