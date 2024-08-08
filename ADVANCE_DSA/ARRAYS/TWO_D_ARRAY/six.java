package DSA2.ADVANCE_DSA.ARRAYS.TWO_D_ARRAY;

// print spiral matrix
public class six {
    public static void main(String[] args) {
        int arr[][] = { { 13, 14, 12, 8 }, { 9, 1, 2, 7 }, { 0, 4, 3, 0 }, { 10, 5, 6, 11 } };

        // output => [13,14,12,8,7,0,11,6,5,10,0,9,1,2,3,4]
        int rows = arr.length;
        int cols = arr[0].length;
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        while (top <= bottom && left <= right) {
            // print top row
            for (int j = left; j <= right; j++) {
                System.out.print(arr[top][j] + " ");
            }
            top++;

            // print right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // print bottom row
            for (int j = right; j >= left; j--) {
                System.out.print(arr[bottom][j] + " ");
            }
            bottom--;

            // print left column
            for (int i = bottom; i >= top; i--) {
                System.out.print(arr[i][left] + " ");
            }
            left++;
        }
    }
}
