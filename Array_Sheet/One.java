package DSA2.Array_Sheet;

// Reverse the array
public class One {
    public static void main(String[] args) {
        int[] arr = { 23, 74, 18, 41, 22, 20 };
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            // swap
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
