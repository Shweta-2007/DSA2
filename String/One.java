package DSA2.String;

// Reverse the string
public class One {

    public static String ReverseString(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String s = "hello";
        // output => olleh
        String reversed = ReverseString(s);
        System.out.println(reversed);

    }
}