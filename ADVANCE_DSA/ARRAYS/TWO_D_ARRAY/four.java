package DSA2.ADVANCE_DSA.ARRAYS.TWO_D_ARRAY;

public class four {
    public static void main(String[] args) {
        int arr[][] = { { -5, -2, 1, 13 }, { -4, 0, 3, 14 }, { -3, 2, 5, 18 }, { 2, 6, 10, 20 } };

        int element = 6;
        int rows = arr.length;
        int cols = arr[0].length;
        boolean isPresent = false;

        // start from top right
        int i = 0;
        int j = cols - 1;

        while (i < rows && j >= 0) {
            if (arr[i][j] == element) {
                isPresent = true;
                break;
            } else if (arr[i][j] > element) {
                // move leftward
                j--;
            } else {
                // move downward
                i++;
            }
        }
        if (isPresent) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
