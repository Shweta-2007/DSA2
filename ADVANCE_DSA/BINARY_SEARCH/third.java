package DSA2.ADVANCE_DSA.BINARY_SEARCH;

//Every element occurs twice except for 1. Find that unique element.Note : Duplicates are adjacent to each other and array isn't necessarily sorted. 

public class third {
    public static int UniqueElement(int[] arr) {
        int n = arr.length;
        // Edge case
        if (n == 1) {
            return arr[0];
        } else if (arr[0] != arr[1]) {
            return arr[0];
        } else if (arr[n - 1] != arr[n - 2]) {
            return arr[n - 1];
        }

        int left = 1, right = n - 2;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }
            int firstOccurence = mid;
            if (arr[mid] == arr[mid - 1]) {
                firstOccurence = mid - 1;
            }
            if (firstOccurence % 2 == 0) {
                // neglect left side
                left = mid + 1;
            } else {
                // neglect right side
                right = mid - 1;
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
