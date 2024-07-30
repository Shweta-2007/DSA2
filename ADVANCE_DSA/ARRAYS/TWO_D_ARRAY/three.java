package DSA2.ADVANCE_DSA.ARRAYS.TWO_D_ARRAY;

// Search in row-wise and column-wise sorted 2D array, If there are multiples then return smallest value of i * 1009 + j
public class three {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2 }, { 3, 3 } };

        int element = 3;
        boolean isPresent = false;
        int rows = arr.length;
        int cols = arr[0].length;

        // Start from the top right
        int i = 0;
        int j = cols - 1;

        // Variables to store minimum index value
        int minIndexValue = Integer.MAX_VALUE;

        while (i < rows && j >= 0) {
            if (arr[i][j] == element) {
                // Calculate the index value based on 1-based indexing
                int currentIndexValue = (i + 1) * 1009 + (j + 1);
                if (currentIndexValue < minIndexValue) {
                    minIndexValue = currentIndexValue;
                }
                isPresent = true;
                // Move left to check for other occurrences
                j--;
            } else if (arr[i][j] < element) {
                // Move down if the current value is less than the element
                i++;
            } else {
                // Move left if the current value is greater than the element
                j--;
            }
        }

        // Print the result
        if (isPresent) {
            System.out.println("minIndexValue: " + minIndexValue);
        } else {
            System.out.println("-1");
        }
    }
}
