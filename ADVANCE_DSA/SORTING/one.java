package DSA2.ADVANCE_DSA.SORTING;

import java.util.Arrays;

// find the smallest number that can be formed by rearranging the digits of the given number in an array. return the smallest number in the form of an array, 
// Here it is given that it consists of only digits means it will only contain numbers from 0 to 9
public class one {
    public static int[] smallestNumber(int[] digits) {
        // create a frequency array
        int fArray[] = new int[10];
        for (int i = 0; i < digits.length; i++) {
            fArray[digits[i]]++;
        }

        int index = 0;
        // iterate on outer loop from 0 to 9
        for (int value = 0; value <= 9; value++) {
            // iterate on inner loop on frequency of that value
            for (int i = 0; i < fArray[value]; i++) {
                digits[index] = value;
                index++;

            }
        }

        return digits;
    }

    public static void main(String[] args) {
        int digits[] = { 3, 1, 4, 1, 5, 9 };
        int result[] = smallestNumber(digits);
        System.out.println(Arrays.toString(result));
    }
}