package DSA2;

public class QuerySum {
    public static void main(String[] args) {
        int A[] = { -3, 6, 2, 4, 5, 2, 8, -9, 3, 1 };
        int arrayLength = A.length;
        int Q[][] = { { 4, 8 }, { 3, 7 }, { 1, 3 }, { 0, 4 }, { 7, 7 } };
        int queryLength = Q.length;

        // for (int i = 0; i < queryLength; i++) {
        // int l = Q[i][0];
        // int r = Q[i][1];
        // int sum = 0;
        // for (int j = l; j <= r; j++) {
        // sum += A[j];
        // }
        // System.out.println(sum);
        // }

        // create prefix sum
        int pSum[] = new int[arrayLength];
        pSum[0] = A[0];
        for (int i = 1; i < arrayLength; i++) {
            pSum[i] = pSum[i - 1] + A[i];
        }

        for (int i = 0; i < queryLength; i++) {
            int l = Q[i][0];
            int r = Q[i][1];

            if (l == 0) {
                System.out.println(pSum[r]);
            } else {
                System.out.println(pSum[r] - pSum[l - 1]);
            }

        }

    }

}