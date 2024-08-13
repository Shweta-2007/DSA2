package DSA2.ADVANCE_DSA.RECURSION;

public class five {
    public static int getSum(int arr[], int index) {
        if (index == arr.length - 1)
            return arr[index];
        int recursvieResult = getSum(arr, index + 1);
        return recursvieResult + arr[index];
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        int result = getSum(array, 0);
        System.out.println(result);

    }
}
