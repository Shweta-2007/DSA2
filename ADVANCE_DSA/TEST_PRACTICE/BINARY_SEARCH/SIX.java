package DSA2.ADVANCE_DSA.TEST_PRACTICE.BINARY_SEARCH;

// sorted and rotated array
public class SIX {
    public static int findIndex(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            // if target is in first part
            if (target > arr[0]) {
                // if mid is in second part
                if (arr[mid] < arr[0]) {
                    // neglect right
                    high = mid - 1;
                } else {
                    // if mid is in first part => do normal binary search
                    if (arr[mid] > target) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
            } else {
                // if target is in second part
                // if mid is in first part
                if (arr[mid] >= arr[0]) {
                    // neglect left
                    low = mid + 1;
                } else {
                    // if mid is in second part => do normal binary search
                    if (arr[mid] > target) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 8, 1, 2, 3 };
        int target = 2;
        int ans = findIndex(arr, target);
        System.out.println(ans);
    }
}
