package DSA2.ADVANCE_DSA.BINARY_SEARCH;

// Given a sorted array. Search an element k. If k is present return it's index otherwise return -1
// BINARY SEARCH
public class one {
    public static void main(String[] args) {
        int arr[] = { 3, 6, 9, 12, 14, 19, 20, 23, 25, 27 };
        int k = 20;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == k) {
                System.out.println(mid);
                break;
            } else if (arr[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("-1");
    }
}
