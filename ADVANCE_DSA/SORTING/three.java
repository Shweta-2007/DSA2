package DSA2.ADVANCE_DSA.SORTING;

import java.util.Arrays;

// find the smallest number that can be formed by rearranging the digits of the given number in an array. return the smallest number in the form of an array. Negative numbers are also included => COUNT SORT

public class three {
    public static int[] smallestNumber(int[] digits) {
        // find minimum and maximum
        int minimum = digits[0];
        int maximum = digits[1];
        for (int i = 1; i < digits.length; i++) {
            minimum = Math.min(minimum, digits[i]);
            maximum = Math.max(maximum, digits[i]);
        }

        // create frequency array
        int fArray[] = new int[maximum - minimum + 1];
        for (int i = 0; i < digits.length; i++) {
            fArray[digits[i] - minimum]++;
        }

        int index = 0;

        // iterate from minimum to maximum
        for (int value = minimum; value <= maximum; value++) {
            // iterate on the frequency
            for (int i = 0; i < fArray[value - minimum]; i++) {
                digits[index] = value;
                index++;
            }
        }

        return digits;

    }

    public static void main(String[] args) {
        int digits[] = { -2, 3, 8, 3, -2, 3 };
        int result[] = smallestNumber(digits);
        System.out.println(Arrays.toString(result));
    }
}