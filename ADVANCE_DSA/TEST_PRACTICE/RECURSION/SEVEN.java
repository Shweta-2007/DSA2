package DSA2.ADVANCE_DSA.TEST_PRACTICE.RECURSION;

//Reverse a number
public class SEVEN {
    public static void reverse(int n) {
        if (n == 0) {
            return;
        }

        int remainder = n % 10;
        System.out.print(remainder);

        n = n / 10;
        reverse(n);

    }

    public static void main(String[] args) {
        int n = 10279024;
        reverse(n);
        System.out.println();
    }
}
