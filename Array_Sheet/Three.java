package DSA2.Array_Sheet;

// kth max and min element of an array
public class Three {
    public static void main(String[] args) {
        int arr[] = { 22, 11, 9, 7, 16 };
        int k = 2;
        // Arrays.sort(arr);
        // Insertion sort
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int kthMax = arr[arr.length - k];
        int kthMin = arr[k - 1];

        System.out.println("MAX: " + kthMax);
        System.out.println("MIN: " + kthMin);
    }
}
