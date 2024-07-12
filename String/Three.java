package DSA2.String;

import java.util.Arrays;

// You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.
// You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.
public class Three {
    public static void main(String[] args) {
        String s = "Hello";
        int n = s.length();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result.append((char) c - 32);
            } else if (c >= 'A' && c <= 'Z') {
                result.append((char) c + 32);
            } else {
                result.append(c);
            }
        }

        String ans = result.toString();
        System.out.println(ans);
    }
}
