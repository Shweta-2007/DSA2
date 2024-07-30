package DSA2.String;

// longest substring palindrome
public class Six {

    public static int Expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }


    public static String LongestSubstring(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = Expand(s, i, i);       // Odd length
            int len2 = Expand(s, i, i + 1);   // Even length
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
            // In case of equal length, keep the first one
            // (this condition is implicitly handled by the logic)
        }
        return s.substring(start, end + 1);
    }
    public static void main(String[] args) {
        String s = "abbcccbbbcaaccbababcbcabca";
        String result = LongestSubstring(s);
        System.out.println(result); // Output: "abcbaba" or similar longest palindrome
    }
}
