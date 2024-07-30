package DSA2.Assignment;

public class Six {
    public static void main(String[] args) {
        int arr[] = { 16, 17, 4, 3, 5, 2 };
        int n = arr.length;

        int leadersArray[] = new int[n];
        int leadersCount = 0;
        leadersArray[leadersCount++] = arr[n - 1];
        int maxElem = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {

            for (int j = i + 1; j < n; j++) {
                maxElem = Math.max(maxElem, arr[j]);
            }
            if (arr[i] > maxElem) {
                leadersArray[leadersCount++] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(leadersArray[i] + " ");
        }

    }
}