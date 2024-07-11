package DSA2.Array_Sheet;

// max and min element of array
public class Two {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 1, 7 };
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);

    }

}
