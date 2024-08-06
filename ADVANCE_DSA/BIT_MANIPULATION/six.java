package DSA2.ADVANCE_DSA.BIT_MANIPULATION;

// given an integer array of size N where all elements repeat twice except two. Find those two elements
public class six {
    public static void main(String[] args) {
        int arr[] = { 10, 8, 8, 9, 12, 9, 6, 11, 10, 6, 12, 17 };
        // take xor of all elements
        int value = 0;
        for (int i = 0; i < arr.length; i++) {
            value = value ^ arr[i];
        }

        // find any set bit position in value
        int position = 0;
        for (int i = 0; i < 32; i++) {
            if ((value & (1 << i)) != 0) {
                position = i;
                break;
            }
        }

        // split the array on the basis of position-th bit
        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & (1 << position)) == 0) {
                s1 = s1 ^ arr[i];
            } else {
                s2 = s2 ^ arr[i];
            }
        }

        System.out.println(s1);
        System.out.println(s2);
    }
}
