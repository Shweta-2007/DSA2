package DSA2.ADVANCE_DSA.TEST_PRACTICE.BINARY_SEARCH;

// Given an increasing decreasing array with distinct elements. Find the max elements
public class FOUR {
    public static int findMax(int[] arr) {

        int n = arr.length;
        if (n == 1) {
            return arr[0];
        } else if (arr[n - 1] > arr[n - 2]) {
            return arr[n - 1];
        } else if (arr[0] > arr[1]) {
            return arr[0];
        }
        int low = 1;
        int high = arr.length - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return arr[mid];
            } else if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 8 };
        int ans = findMax(arr);
        System.out.println(ans);
    }
}
