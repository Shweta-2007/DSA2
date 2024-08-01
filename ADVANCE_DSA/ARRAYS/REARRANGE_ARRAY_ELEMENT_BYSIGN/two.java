package DSA2.ADVANCE_DSA.ARRAYS.REARRANGE_ARRAY_ELEMENT_BYSIGN;

public class two {
    public static void main(String[] args) {
        int arr[] = { 1, 2, -3, -1, -2, 3 };
        // output => {1,-3,2,-1,3,-2}
        int n = arr.length;
        int posIndex = 0;
        int negIndex = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                arr[posIndex] = arr[i];
                posIndex += 2;
            } else {
                arr[negIndex] = arr[i];
                negIndex += 2;
            }
        }
    }
}
