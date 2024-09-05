package DSA2.ADVANCE_DSA.BINARY_SEARCH;

// Given an increasing - decreasing array with distinct elements. Find the max element. 

public class four {
    public static int MaxElement(int arr[]) {
        int n = arr.length;
        if (n == 1) {
            return arr[0];
        } else if (arr[0] > arr[1]) {
            return arr[0];
        } else if (arr[n - 1] > arr[n - 2]) {
            return arr[n - 1];
        }
        int left = 1, right = n - 2;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            } else if (arr[mid] < arr[mid + 1]) {
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
        int arr[] = { 1, 3, 5, 10, 15, 12, 6 };
        int ans = MaxElement(arr);
        System.out.println(ans);
    }
}
