package DSA2;

//  You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.

public class ColumnWiseSum {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 2, 3, 4 } };
        int rows = arr.length;
        int cols = arr[0].length;

        int[] columnSums = new int[cols];

        for (int i = 0; i < cols; i++) {
            int sum = 0;
            for (int j = 0; j < rows; j++) {
                sum += arr[j][i];
            }
            columnSums[i] = sum;

        }
        for (int i = 0; i < cols; i++) {
            System.out.println("Sum of column " + i + " = " + columnSums[i]);
        }

    }

}
