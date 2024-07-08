package DSA2.Sorting;

public class Five {

    static void Swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 5, 2, 7 };
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    Swap(arr, j, j + 1);
                } else {
                    break;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
