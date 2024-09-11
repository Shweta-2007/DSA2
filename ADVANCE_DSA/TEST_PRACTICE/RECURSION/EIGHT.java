package DSA2.ADVANCE_DSA.TEST_PRACTICE.RECURSION;

public class EIGHT {

    public static int Index(int numberOfRows, int index) {
        if (numberOfRows == 0) {
            return 0;
        }

        int length = (int) Math.pow(2, numberOfRows);
        int mid = length / 2;
        if (index < mid) {
            // index is in first half
            return Index(numberOfRows - 1, index);
        } else {
            return 1 - Index(numberOfRows - 1, index - mid);
        }

    }

    public static void main(String[] args) {
        int numberOfRows = 4;
        int index = 4;
        int ans = Index(numberOfRows, index);
        System.out.println(ans);
    }
}
