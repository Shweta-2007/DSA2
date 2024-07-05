package DSA2;

public class ElementsDiagonallyRightToLeft {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 }
        };

        int rowsLength = arr.length;
        int colsLength = arr[0].length;

        // PRINT ALL DIAGONAL FROM 0TH ROW
        for (int col = 0; col < colsLength; col++) {
            int i = 0;
            int j = col;

            while (i < rowsLength && j >= 0) {
                System.out.print(arr[i][j]);

                i++;
                j--;

                System.out.println(" ");
            }
        }

        // PRINT ALL DIAGONAL FROM LAST COLUMN
        for (int row = 1; row < rowsLength; row++) {
            int i = row;
            int j = colsLength - 1;

            while (i < rowsLength && j >= 0) {
                System.out.print(arr[i][j]);

                i++;
                j--;

                System.out.println(" ");
            }
        }

    }
}
