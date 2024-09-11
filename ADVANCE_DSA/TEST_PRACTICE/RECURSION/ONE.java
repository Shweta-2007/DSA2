package DSA2.ADVANCE_DSA.TEST_PRACTICE.RECURSION;

// Print array elements in the same order
public class ONE {
    public static void Print(int arr[], int index) {
        if (index == arr.length) {
            return;
        }
        System.out.print(index + " ");
        Print(arr, index + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 3, 4, 2 };
        Print(arr, 0);
    }
}
