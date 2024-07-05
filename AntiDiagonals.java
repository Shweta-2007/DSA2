package DSA2;

public class AntiDiagonals {
    public static int[][] getAntiDiagonals(int[][] A) {
        int N = A.length;
        int[][] result = new int[2 * N - 1][N];

        // Initialize result array with 0s
        for (int i = 0; i < 2 * N - 1; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] = 0;
            }
        }

        // Fill the upper part of the result with anti-diagonals
        for (int index = 0; index < N; index++) {
            int row = 0;
            int col = index;
            int resultRow = index;
            while (col >= 0 && row < N) {
                result[resultRow][row] = A[row][col];
                row++;
                col--;
            }
        }

        // Fill the lower part of the result with anti-diagonals
        for (int index = 1; index < N; index++) {
            int row = index;
            int col = N - 1;
            int resultRow = N + index - 1;
            while (row < N && col >= 0) {
                result[resultRow][row - index] = A[row][col];
                row++;
                col--;
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

        int[][] result = getAntiDiagonals(A);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
