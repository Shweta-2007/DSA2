package DSA2.ADVANCE_DSA.SORTING;

// Given an array A[n]. Calculate number of pairs [i, j] such that i < j && A[i] > A[j], These are called inversion pairs. => use merge sort
public class eight {

    public static void mergeSort(int arr[]) {
        // base condition
        if (arr.length == 1) {
            return;
        }
        int middle = arr.length / 2;
        int left[] = new int[middle];
        int right[] = new int[arr.length - middle];

        // populate left and right array
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }

        for (int i = middle; i < arr.length; i++) {
            right[i - middle] = arr[i];
        }

        // recusrively split
        mergeSort(left);
        mergeSort(right);

        // merge two sorted arrays
        merge2sortedArrays(arr, left, right);
    }

    public static int merge2sortedArrays(int arr[], int left[], int right[]) {
        // left: 2,6,7
        // right: 1,5,9
        int n1 = left.length;
        int n2 = right.length;
        int i = 0, j = 0, k = 0;
        int inversionCount = 0;
        // compare elements of n1 and n2
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                j++;
                k++;
                inversionCount += n1 - i;
            }
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
        return inversionCount;
    }
}
