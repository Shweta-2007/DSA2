package DSA2.ADVANCE_DSA.BIT_MANIPULATION;

public class seven {
    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 6 };
        int n = arr.length;
        int arrayXOR = 0;
        for (int i = 0; i < n; i++) {
            arrayXOR = arrayXOR ^ arr[i];
        }

        int rangeXOR = 0;
        for (int i = 1; i <= n + 2; i++) {
            rangeXOR = rangeXOR ^ i;
        }

        int finalXOR = arrayXOR ^ rangeXOR;

        // find first set bit position for finalXOR
        int position = 0;
        for (int i = 0; i < 32; i++) {
            if ((finalXOR & (1 << i)) != 0) {
                position = i;
                break;
            }
        }

        // Split the array and range based on the position-th bit
        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & (1 << position)) == 0) {
                s1 = s1 ^ arr[i];
            } else {
                s2 = s2 ^ arr[i];
            }
        }

        for (int i = 1; i <= n + 2; i++) {
            if ((i & (1 << position)) == 0) {
                s1 = s1 ^ i;
            } else {
                s2 = s2 ^ i;
            }
        }

        System.out.println(s1);
        System.out.println(s2);

    }
}
