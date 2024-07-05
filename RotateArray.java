package DSA2;

public class RotateArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int rowLength = arr.length;
        int colLength = arr[0].length;

        // TRANSPOSE
        for (int i = 0; i < rowLength; i++) {
            for (int j = i + 1; j < colLength; j++) {
                // swap
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // REVERSE
        for (int i = 0; i < rowLength; i++) {
            Reverse(arr[i]);
        }

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    // REVERSE FUNCTION
    public static void Reverse(int[] A) {
        int l = 0;
        int r = A.length - 1;
        while (l < r) {
            int temp = A[l];
            A[l] = A[r];
            A[r] = temp;

            l++;
            r--;
        }
    }

}
