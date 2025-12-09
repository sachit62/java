import java.util.*;

public class postfixToInfix {

    private static boolean isOperator(char c) {
        return c=='+' || c=='-' || c=='*' || c=='/' || c=='^';
    }

    public static String convert(String postfix) {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);

            // skip spaces
            if (c == ' ') continue;

            // operand
            if (Character.isLetterOrDigit(c)) {
                st.push(String.valueOf(c));
            }
            // operator
            else if (isOperator(c)) {
                String b = st.pop();   // right operand
                String a = st.pop();   // left operand

                String expr = "(" + a + c + b + ")";
                st.push(expr);
            }
        }

        return st.pop();
    }

    public static void main(String[] args) {
        String postfix = "abcd^e-fgh*+^*+i-";
        System.out.println("Infix: " + convert(postfix));
    }
}
