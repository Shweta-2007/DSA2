package DSA2.ADVANCE_DSA.TEST_PRACTICE.SORTING;
//Given an array of integers A of size N that is a permutation of [0, 1, 2, ..., (N-1)], if we split the array into some number of "chunks" (partitions), and individually sort each chunk. After concatenating them in order of splitting, the result equals the sorted array.What is the most number of chunks we could have made?

public class ELEVEN {
    public static int NumberOfChunks(int arr[]) {
        int chunks = 0;
        int maxChunk = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxChunk = Math.max(maxChunk, arr[i]);
            if (maxChunk == i) {
                chunks++;
            }
        }
        return chunks;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 0, 1, 3 };
        int ans = NumberOfChunks(arr);
        System.out.println(ans);
    }
}
