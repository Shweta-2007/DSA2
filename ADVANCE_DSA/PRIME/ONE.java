package DSA2.ADVANCE_DSA.PRIME;

public class ONE {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return false;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int n = 17;
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

}
