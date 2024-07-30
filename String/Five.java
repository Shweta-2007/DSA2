package DSA2.String;

public class Five {

    public static Boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abmadamtam";
        Boolean result = isPalindrome(s, 1, 6);
        System.out.println("RESULT: " + result);

    }
}
