package DSA2.ADVANCE_DSA.RECURSION;

// check pallindrome
public class nine {
    public static boolean isPallindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPallindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String str = "racecar";
        boolean result = isPallindrome(str, 0, str.length() - 1);
        System.out.println(result);
    }
}
