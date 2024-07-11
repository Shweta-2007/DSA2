package DSA2.Array_Sheet;

import java.util.*;;

// given an array which consists of only 0,1 and 2. sort the array without using any sorting alog
public class Four {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 0, 1, 2 };
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // swap mid with low
                    int temp = arr[mid];
                    arr[mid] = arr[low];
                    arr[low] = temp;
                    mid++;
                    low++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    // swap mid with high
                    int temp1 = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp1;
                    high--;
                    break;
            }

        }

        System.out.print(Arrays.toString(arr));

    }
}
