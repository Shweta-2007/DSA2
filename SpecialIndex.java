package DSA2;

// < Question > : Given an arr[N], count the number of special indices in the array. Special Index : Index after removing which,
// Sum of even indexed elements = sum of odd indexed elements.
public class SpecialIndex {
    public static void main(String[] args) {
        int A[] = { 4, 3, 2, 7, 6, -2 };
        int n = A.length;

        // even prefix sum
        int pSumEven[] = new int[n];
        int pSumOdd[] = new int[n];
        pSumEven[0] = A[0];
        pSumOdd[0] = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                pSumEven[i] = pSumEven[i - 1] + A[i];
            } else {
                pSumEven[i] = pSumEven[i - 1];
            }

        }

        // odd prefix sum

        for (int i = 1; i < n; i++) {
            if (i % 2 == 1) {
                pSumOdd[i] = pSumOdd[i - 1] + A[i];
            } else {
                pSumOdd[i] = pSumOdd[i - 1];
            }
        }

        int count = 0;
        if (pSumOdd[n - 1] - pSumOdd[0] == pSumEven[n - 1] - pSumEven[0]) {
            count++;
        }
        for (int i = 1; i < n; i++) {
            // even sum = sum of even from 0 to i - 1 and sum of odd from i to n - 1
            int evenSum = pSumEven[i - 1] + pSumOdd[n - 1] - pSumOdd[i];
            int oddSum = pSumOdd[i - 1] + pSumEven[n - 1] - pSumEven[i];
            if (evenSum == oddSum) {
                count++;
            }
        }

        System.out.println(count);

    }
}
