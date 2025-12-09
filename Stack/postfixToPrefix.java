import java.util.*;

public class postfixToPrefix {

    private static boolean isOperator(char c) {
        return c=='+' || c=='-' || c=='*' || c=='/' || c=='^';
    }

    public static String convert(String postfix) {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);

            if (c == ' ') continue;

            // operand → push
            if (Character.isLetterOrDigit(c)) {
                st.push(String.valueOf(c));
            }
            // operator → pop 2 → create prefix
            else if (isOperator(c)) {
                String right = st.pop();
                String left = st.pop();

                String expr = c + left + right;   // PREFIX format
                st.push(expr);
            }
        }

        return st.pop();
    }

    public static void main(String[] args) {
        String postfix = "abcd^e-fgh*+^*+i-";
        System.out.println("Prefix: " + convert(postfix));
    }
}
