package DSA2.Sorting;

public class Four {

    static void Swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 4, 1, 2 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int minElement = arr[i];
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < minElement) {
                    minElement = arr[j];
                    minIndex = j;
                }
            }

            // SWAP I WITH MIN_INDEX
            Swap(arr, i, minIndex);

        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
