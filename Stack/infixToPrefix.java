import java.util.*;

public class infixToPrefix {

    // precedence of operators
    private static int prec(char c) {
        switch (c) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
        }
        return -1;
    }

    private static boolean isOperator(char c) {
        return c=='+' || c=='-' || c=='*' || c=='/' || c=='^';
    }

    // convert infix to postfix (helper)
    private static String infixToPostfix(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // operand (digit or letter)
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // '('
            else if (c == '(') {
                st.push(c);
            }
            // ')'
            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result.append(st.pop());
                }
                st.pop(); // remove '('
            }
            // operator
            else if (isOperator(c)) {
                while (!st.isEmpty() && prec(st.peek()) >= prec(c)) {
                    // for right associative '^'
                    if (c == '^' && st.peek() == '^') break;
                    result.append(st.pop());
                }
                st.push(c);
            }
        }

        // pop all remaining operators
        while (!st.isEmpty()) {
            result.append(st.pop());
        }
        return result.toString();
    }

    // MAIN conversion: infix -> prefix
    public static String convert(String infix) {

        // 1️⃣ Reverse the infix
        StringBuilder sb = new StringBuilder(infix);
        sb.reverse();
        char[] arr = sb.toString().toCharArray();

        // 2️⃣ Swap '(' and ')'
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') arr[i] = ')';
            else if (arr[i] == ')') arr[i] = '(';
        }

        // 3️⃣ Convert reversed expression to postfix
        String postfix = infixToPostfix(new String(arr));

        // 4️⃣ Reverse postfix → prefix
        return new StringBuilder(postfix).reverse().toString();
    }

    public static void main(String[] args) {
        String infix = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Prefix: " + convert(infix));
    }
}
