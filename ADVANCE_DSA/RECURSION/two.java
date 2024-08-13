package DSA2.ADVANCE_DSA.RECURSION;

// calculate power => x ^ y
public class two {
    public static int power(int x, int y) {
        if (y == 0)
            return 1;
        int halfPower = power(x, y / 2);
        if (y % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return halfPower * halfPower * x;
        }

    }

    public static void main(String[] args) {
        int result = power(2, 10);
        System.out.println(result);
    }
}