package DSA2;

// < Question > : Given a string s of lowercase characters, return the count of pairs (i, j) such that i < j and s[ i ] is 'a' and s[ j ] is 'g'.

public class CountPairs {
    public static void main(String[] args) {
        String s = "acgdgag";
        int count = 0;
        int n = s.length();
        // TIME COMPLEXITY => O(N2)
        // for (int i = 0; i < n; i++) {
        // if (s.charAt(i) == 'a') {
        // for (int j = i + 1; j < n; j++) {
        // if (s.charAt(j) == 'g') {
        // count++;
        // }
        // }
        // }
        // }

        int countA = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'a') {
                countA++;
            } else if (s.charAt(i) == 'g') {
                count = count + countA;
            }
        }

        System.out.println(count);

    }

}
