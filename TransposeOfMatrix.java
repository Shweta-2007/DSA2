package DSA2;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 21, 62, 16, 44, 55, 100, 16, 86, 29 },
                { 62, 72, 85, 35, 14, 1, 89, 15, 73 },
                { 42, 44, 30, 56, 25, 52, 61, 23, 54 },
                { 5, 35, 12, 35, 55, 74, 50, 50, 80 },
                { 2, 65, 65, 82, 26, 36, 66, 60, 1 },
                { 18, 1, 16, 91, 42, 11, 72, 97, 35 },
                { 23, 57, 9, 28, 13, 44, 40, 47, 98 }
        };

        int rowLength = arr.length;
        int colLength = arr[0].length;

        int[][] transpose = new int[colLength][rowLength];

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        // Print the transposed matrix
        for (int i = 0; i < colLength; i++) {
            for (int j = 0; j < rowLength; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
