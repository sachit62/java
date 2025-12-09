import java.util.*;

public class prefixToPostfix {

    private static boolean isOperator(char c) {
        return c=='+' || c=='-' || c=='*' || c=='/' || c=='^';
    }

    public static String convert(String prefix) {
        Stack<String> st = new Stack<>();

        // Traverse from right to left
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);

            if (c == ' ') continue;

            // operand → push
            if (Character.isLetterOrDigit(c)) {
                st.push(String.valueOf(c));
            }
            // operator → pop 2 → create postfix
            else if (isOperator(c)) {
                String left = st.pop();
                String right = st.pop();

                String expr = left + right + c;   // POSTFIX format
                st.push(expr);
            }
        }

        return st.pop();
    }

    public static void main(String[] args) {
        String prefix = "-+a*b^-^cde+f*ghi";
        System.out.println("Postfix: " + convert(prefix));
    }
}
