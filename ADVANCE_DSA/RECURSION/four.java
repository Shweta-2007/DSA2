package DSA2.ADVANCE_DSA.RECURSION;

// print array elements
public class four {
    public static int getMaxArray(int[] arr, int index) {
        if (index == arr.length - 1)
            return arr[index];

        int recursvieResult = getMaxArray(arr, index + 1);
        return Math.max(arr[index], recursvieResult);

    }

    public static void main(String[] args) {
        int array[] = { 2, 6, 1, 8, 0, 3 };
        int max = getMaxArray(array, 0);
        System.out.println(max);
    }
}
