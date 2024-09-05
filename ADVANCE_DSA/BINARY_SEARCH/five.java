package DSA2.ADVANCE_DSA.BINARY_SEARCH;

//Given arr[ N ]. Find any one local minima.Local Minima : An element which is less than or equals to it's adjacent elements. 

public class five {
    public static int LocalMinima(int arr[]) {
        int n = arr.length;
        if (n == 1) {
            return arr[0];
        } else if (arr[0] <= arr[1]) {
            return arr[0];
        } else if (arr[n - 1] <= arr[n - 2]) {
            return arr[n - 1];
        }
        int left = 1;
        int right = n - 2;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= arr[mid - 1] && arr[mid] <= arr[mid + 1]) {
                return arr[mid];
            } else if (arr[mid] >= arr[mid + 1]) {
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
        int arr[] = { 30, 6, 1, 0, 9, 15, 80 };
        int ans = LocalMinima(arr);
        System.out.println(ans);
    }
}
