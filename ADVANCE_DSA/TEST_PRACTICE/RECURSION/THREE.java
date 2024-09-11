package DSA2.ADVANCE_DSA.TEST_PRACTICE.RECURSION;

// print n to 1
public class THREE {
    public static void print(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n + " ");
        print(n - 1);
    }

    public static void main(String[] args) {
        int n = 9;
        print(n);
        System.out.println();
    }
}
