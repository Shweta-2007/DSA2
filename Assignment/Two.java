package DSA2.Assignment;

// Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the given inclusive range [B, C].
public class Two {
    public static void main(String[] args) {
        int A[] = { 2, 5, 6 };
        int n = A.length;
        int B = 0;
        int C = 2;
        int start = B;
        int end = C;

        while (end > start) {
            int temp = A[end];
            A[end] = A[start];
            A[start] = temp;

            start++;
            end--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
