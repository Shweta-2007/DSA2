package DSA2.ADVANCE_DSA.SORTING;

// Given two array A[n] and B[n]. Calculate number of pairs i,j such that A[i] > B[j]
public class six {
    public static void main(String[] args) {
        int arr1[] = { 7, 3, 5 };
        int arr2[] = { 2, 0, 6 };
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] > arr2[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
