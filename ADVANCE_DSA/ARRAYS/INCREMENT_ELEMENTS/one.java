package DSA2.ADVANCE_DSA.ARRAYS.INCREMENT_ELEMENTS;

import java.util.*;

public class one {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0, 0, 0, 0 };
        int Q[][] = { { 3, 4 }, { 1, 3 }, { 4, -2 } };

        int QArray[] = new int[arr.length];
        for (int i = 0; i < Q.length; i++) {
            int index = Q[i][0];
            int value = Q[i][1];

            QArray[index] += value;
        }
        // prefix sum
        for (int i = 1; i < QArray.length; i++) {
            QArray[i] = QArray[i - 1] + QArray[i];
        }

        System.out.print(Arrays.toString(QArray));
    }

}
