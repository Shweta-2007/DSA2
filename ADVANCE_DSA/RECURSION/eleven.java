package DSA2.ADVANCE_DSA.RECURSION;

//You are given an array A of size N. Write a recursive function that returns the first index at which an integer B is found in the array.NOTE: If B is not found anywhere in the array then return -1.

public class eleven {
    public static int firstIndex(int arr[], int idx, int target) {
        if (idx == arr.length) {
            return -1;
        }

        if (arr[idx] == target) {
            return idx;
        }

        return firstIndex(arr, idx + 1, target);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 8, 7, 8, 3 };
        int target = 8;
        int result = firstIndex(arr, 0, target);
        System.out.println(result);

    }

}
