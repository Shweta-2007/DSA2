package DSA2.ADVANCE_DSA.ARRAYS.TWO_D_ARRAY;

// print boundary elements
public class five {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        // output => 1 2 3 4 8 12 16 15 14 13 9 5

        int rows = arr.length;
        int cols = arr[0].length;

        // print first row => 1,2,3,4
        for (int j = 0; j < cols; j++) {
            System.out.print(arr[0][j] + " ");
        }

        // print last column => 8,12,16
        for (int i = 1; i < rows; i++) {
            System.out.print(arr[i][cols - 1] + " ");
        }

        // print last row => 15,14,13
        for (int j = cols - 2; j >= 0; j--) {
            System.out.print(arr[rows - 1][j] + " ");
        }

        // print first column => 9,5
        for (int i = rows - 2; i > 0; i--) {
            System.out.print(arr[i][0] + " ");
        }

    }
}
