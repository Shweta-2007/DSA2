package DSA2;

public class ScalarMultiplication {
    public static int[][] scalarMultiply(int[][] A, int B) {
        int N = A.length; // Number of rows
        int M = A[0].length; // Number of columns

        int[][] result = new int[N][M];

        // Perform scalar multiplication
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                result[i][j] = A[i][j] * B;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] A = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int B = 2;

        int[][] result = scalarMultiply(A, B);

        // Print the resulting matrix
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
