package DSA2.String;

public class Two {

    public static Boolean isPallindrom(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;

    }

    public static void main(String[] args) {
        String s = "abccba";
        Boolean result = isPallindrom(s);
        System.out.println(result);
    }
}
