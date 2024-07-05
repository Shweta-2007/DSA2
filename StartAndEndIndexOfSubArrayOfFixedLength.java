package DSA2;

public class StartAndEndIndexOfSubArrayOfFixedLength {
    public static void main(String[] args) {
        int arr[] = { 5, 7, 9, 8, -2, 6, 65, 19 };
        int n = arr.length;
        int k = 3;
        int startIndex = 0;
        int endIndex = k - 1;

        while (endIndex < n) {
            System.out.print(startIndex);
            System.out.print(endIndex);
            System.out.println(" ");
            startIndex++;
            endIndex++;
        }
    }
}
