package DSA2.ADVANCE_DSA.RECURSION;

// print array elements
public class three {
    public static void printArray(int[] arr, int index) {
        if (index == arr.length)
            return;
        System.out.print(arr[index] + " ");
        printArray(arr, index + 1);
    }

    public static void main(String[] args) {
        int array[] = { 2, 6, 1, 8, 0, 3 };
        printArray(array, 0);
    }
}
