package DSA2.ADVANCE_DSA.SORTING;

import java.util.Arrays;

// find the smallest number that can be formed by rearranging the digits of the given number in an array. return the smallest number in the form of an array, 
public class one {
    public static int[] smallestNumber(int[] digits) {
        int length = digits.length;
        int freqArray[] = new int[10];
        for (int i = 0; i < length; i++) {
            freqArray[digits[i]]++;
        }

        System.out.println("freqArray:" + Arrays.toString(freqArray));

        int result[] = new int[length];
        int index = 0;
        for (int d = 0; d <= 9; d++) {
            for (int i = 0; i < freqArray[d]; i++) {
                result[index] = d;
                index++;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int digits[] = { 3, 1, 4, 1, 5, 9 };
        int result[] = smallestNumber(digits);
        System.out.println(Arrays.toString(result));
    }
}