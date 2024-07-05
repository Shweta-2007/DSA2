package DSA2;

// Question => Print all possible sub-arrays of the given array
public class AllSubArray {
    public static void main(String[] args) {
        int[] A = { 5, 7, 3, 2 };
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(A[k]);
                }
                System.out.println(" ");
            }
        }
    }

}
