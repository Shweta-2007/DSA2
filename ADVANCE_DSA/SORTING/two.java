package DSA2.ADVANCE_DSA.SORTING;

import java.util.Arrays;

// find the smallest number that can be formed by rearranging the digits of the given number in an array. return the smallest number in the form of an array. Negative numbers are also included

public class two {
    public static int[] smallestNumber(int[] digits) {
        int length = digits.length;
        int result[] = new int[length];

        int smallest = digits[0];
        int largest = digits[0];
        for (int i = 0; i < length; i++) {
            smallest = Math.min(smallest, digits[i]); // -2
            largest = Math.max(largest, digits[i]); // 8
        }

        // freqArray will contain digit from -2 to 8
        int freqArray[] = new int[largest - smallest + 1];
        for (int i = 0; i < length; i++) {
            freqArray[digits[i] - smallest]++;
        }

        int index = 0;
        for (int d = smallest; d <= largest; d++) {
            for (int i = 0; i < freqArray[d - smallest]; i++) {
                result[index] = d;
                index++;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int digits[] = { -2, 3, 8, 3, -2, 3 };
        int result[] = smallestNumber(digits);
        System.out.println(Arrays.toString(result));
    }
}