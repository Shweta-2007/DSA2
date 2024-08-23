package DSA2.ADVANCE_DSA.RECURSION;

// print string in reverse
public class thirteen {
    public static void printReverseString(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.println(str.charAt(idx));
        printReverseString(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        printReverseString(str, str.length() - 1);
    }

}
