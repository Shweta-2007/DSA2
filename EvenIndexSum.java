package DSA2;

// < Question > :
// Given an arr[N] and Q queries with start(s) and end(e) index. For every query print sum of all even indexed elements from s to e.

public class EvenIndexSum {
    public static void main(String[] args) {
        int A[] = { 2, 3, 1, 6, 4, 5 };
        int arrayLength = A.length;
        int Q[][] = { { 1, 3 }, { 2, 5 }, { 0, 4 }, { 3, 3 } };
        int queryLength = Q.length;

        // for (int i = 0; i < queryLength; i++) {
        // int sum = 0;
        // int s = Q[i][0];
        // int e = Q[i][1];

        // for (int j = s; j <= e; j++) {
        // if (j % 2 == 0) {
        // sum += A[j];
        // }
        // }

        // System.out.println(sum);

        // }

        // create prefix sum of even index only
        int pSum[] = new int[arrayLength];
        pSum[0] = A[0];
        for (int i = 1; i < arrayLength; i++) {
            if (i % 2 == 0) {
                pSum[i] = pSum[i - 1] + A[i];
            } else {
                pSum[i] = pSum[i - 1];
            }

        }

        for (int i = 0; i < queryLength; i++) {
            int s = Q[i][0];
            int e = Q[i][1];

            if (s == 0) {
                System.out.println(pSum[e]);
            } else {
                System.out.println(pSum[e] - pSum[s - 1]);
            }

        }
    }

}
