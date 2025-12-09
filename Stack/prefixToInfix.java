import java.util.*;

public class prefixToInfix {

    private static boolean isOperator(char c) {
        return c=='+' || c=='-' || c=='*' || c=='/' || c=='^';
    }

    public static String convert(String prefix) {
        Stack<String> st = new Stack<>();

        // traverse from right to left
        for (int i = prefix.length() - 1; i >= 0; i--) {

            char c = prefix.charAt(i);

            if (c == ' ') continue;

            // operand → push
            if (Character.isLetterOrDigit(c)) {
                st.push(String.valueOf(c));
            }
            // operator → pop 2, combine, push back
            else if (isOperator(c)) {
                String a = st.pop();  // left operand
                String b = st.pop();  // right operand

                String expr = "(" + a + c + b + ")";
                st.push(expr);
            }
        }

        return st.pop();
    }

    public static void main(String[] args) {
        String prefix = "-+a*b^-^cde+f*ghi";
        System.out.println("Infix: " + convert(prefix));
    }
}
