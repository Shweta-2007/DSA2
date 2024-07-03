package DSA2;

public class RowWiseSum {
    public static void main(String[] args) {
        int[][] arr = { { 10, 2, 7, 3 }, { 9, 5, -1, 8 }, { 3, 11, 15, 20 } };
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }
            System.out.println(sum);
        }

    }

}
