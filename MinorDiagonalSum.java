package DSA2;

public class MinorDiagonalSum {
    public static int findMinorDiagonalSum(int[][] A) {
        int N = A.length;
        int sum = 0;

        // Iterate through the matrix to find the minor diagonal elements
        for (int i = 0; i < N; i++) {
            sum += A[i][N - 1 - i]; // A[i][N - 1 - i] represents the minor diagonal elements
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] A = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int result = findMinorDiagonalSum(A);
        System.out.println("The sum of the minor diagonal elements is: " + result);
    }
}
