package DSA2.ADVANCE_DSA.TEST_PRACTICE.BINARY_SEARCH;

//Every element occurs twice except for 1. Find that unique element.  Note : Duplicates are adjacent to each other and array isn't necessarily sorted. 
// 2 2 5 5 6
public class THREE {
    public static int UniqueElement(int arr[]) {

        if (arr.length == 1) {
            return arr[0];
        } else if (arr[arr.length - 1] != arr[arr.length - 2]) {
            return arr[arr.length - 1];
        } else if (arr[0] != arr[1]) {
            return arr[0];
        }
        int low = 1;
        int high = arr.length - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int firstOccurence = mid;
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }
            if (arr[mid] == arr[mid - 1]) {
                firstOccurence = mid - 1;
            }
            if (firstOccurence % 2 == 0) {
                // neglect left
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 8, 5, 5, 9, 9, 6, 2, 2, 1, 1 };
        int ans = UniqueElement(arr);
        System.out.println(ans);

    }
}
