package DSA2.ADVANCE_DSA.ARRAYS.TWO_D_ARRAY;

// search in row wise and column wise sorted 2D array
// T.C => O(N * M) S.C => O(1)
public class one {
    public static void main(String[] args) {
        int arr[][] = { { -5, -2, 1, 13 }, { -4, 0, 3, 14 }, { -3, 2, 5, 18 }, { 2, 6, 10, 20 } };

        int element = 6;
        boolean isPresent = false;
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == element) {
                    isPresent = true;

                    break;
                }
            }
        }
        if (isPresent) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}