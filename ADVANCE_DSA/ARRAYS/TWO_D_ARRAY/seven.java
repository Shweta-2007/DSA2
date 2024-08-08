package DSA2.ADVANCE_DSA.ARRAYS.TWO_D_ARRAY;

// Given matrix[N][M]. Find sum of all sub matrix sum
public class seven {
    public static void main(String[] args) {
        int arr[][] = { { 4, 9, 6 }, { 5, -1, 2 } };
        int N = arr.length;
        int M = arr[0].length;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sum += arr[i][j] * (i + 1) * (j + 1) * (N - i) * (M - j);
            }
        }
        System.out.println(sum);
    }
}
