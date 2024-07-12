package DSA2.Assignment;

// Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.
public class Three {
    static void Reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int A[] = { 9, 2, 6, 3, 8, 9, 7, 6, 4 };
        int B = 4;
        int n = A.length;

        Reverse(A, 0, n - 1);
        Reverse(A, 0, B - 1);
        Reverse(A, B, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

    }
}
