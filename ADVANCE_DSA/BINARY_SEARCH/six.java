package DSA2.ADVANCE_DSA.BINARY_SEARCH;

// Search an element in sorted rotated array. Element will be distinct in array. Return index of that element
public class six {
    public static int FindIndex(int arr[], int target) {

        int n = arr.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            // if target is in part 2
            if (target < arr[0]) {
                // if middle element is part 1
                if (arr[mid] > arr[0]) {
                    // go to right side
                    left = mid + 1;
                } else {
                    // if middle element is in part 2, do normal binary search
                    if (arr[mid] > target) {
                        // go to left
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }

                }
            } else {
                // if target is in part 1
                // if middle element is in part 2
                if (arr[mid] < arr[0]) {
                    // go to left
                    right = mid - 1;
                } else {
                    // if middle element is in part 1, do normal binary search
                    if (arr[mid] > target) {
                        // go to left
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 8, 1, 2, 3 };
        int k = 2;
        int index = FindIndex(arr, k);
        System.out.println(index);
    }
}
