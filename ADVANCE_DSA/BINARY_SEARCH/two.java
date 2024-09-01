package DSA2.ADVANCE_DSA.BINARY_SEARCH;

// Given a sorted array, Find first occurence of k.
public class two {
    public static void main(String[] args) {
        int[] arr = { -5, -5, -3, 0, 0, 1, 5, 5, 5, 5, 5, 8, 10, 10, 15 };
        int k = 5;
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                ans = mid;
                // now search in lower half
                high = mid - 1;
            } else if (arr[mid] < k) {
                // ignore lower half
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(ans);
    }
}
