package DSA2.String;

// You are given a string A of size N.

// Return the string A after reversing the string word by word.
// NOTE:
// * A sequence of non-space characters constitutes a word.
// * Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
// * If there are multiple spaces between words, reduce them to a single space in the reversed string.

public class Four {
    public static void main(String[] args) {
        // String input = " Hello World ";
        String input = "  i am good now";
        String[] words = input.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        String result = reversed.toString();
        System.out.println(result);
    }
}
