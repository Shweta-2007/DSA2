package DSA2.Sorting;

public class Three {
    public static void main(String[] args) {
        Integer arr[] = { -10, 1, 1, 2, 4, 4, 4, 8, 10 };
        int n = arr.length;
        int nobelCount = 0;
        int countSmaller = 0;

        if (arr[0] == 0) {
            nobelCount++;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] != arr[i]) {
                countSmaller = i;
            }
            if (countSmaller == arr[i]) {
                nobelCount++;
            }
        }

        System.out.println(nobelCount);

    }

}
