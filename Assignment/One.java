package DSA2.Assignment;

// Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
public class One {
    public static void main(String[] args) {
        int A[] = { 1, 2, 4 };
        int B = 4;
        int n = A.length;
        boolean isGoodPair = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && A[i] + A[j] == B) {
                    isGoodPair = true;
                    break;
                }
            }
            if (isGoodPair) {
                break;
            }
        }

        System.out.println(isGoodPair);
    }
}
