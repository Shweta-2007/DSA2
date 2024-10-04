package DSA2.ADVANCE_DSA.TEST_PRACTICE.BINARY_SEARCH;

// local minima
public class FIVE {
    public static int localMinima(int arr[]) {
        int n = arr.length;
        if (n == 1) {
            return arr[0];
        } else if (arr[0] <= arr[1]) {
            return arr[0];
        } else if (arr[n - 1] <= arr[n - 2]) {
            return arr[n - 1];
        }

        int low = 1;
        int high = n - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                return arr[mid];
            } else if (arr[mid] > arr[mid + 1]) {
                // neglect left part
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 1, 0, 9, 15, 8 };
        int ans = localMinima(arr);
        System.out.println(ans);
    }
}
