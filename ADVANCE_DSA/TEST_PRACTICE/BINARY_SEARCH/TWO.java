package DSA2.ADVANCE_DSA.TEST_PRACTICE.BINARY_SEARCH;

public class TWO {
    public static int findFirstOccurence(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 4, 4, 4, 5, 6, 7, 8, 9, 10 };
        int target = 4;
        int result = findFirstOccurence(arr, target);
        System.out.println(result);

    }
}
