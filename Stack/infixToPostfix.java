import java.util.*;

public class infixToPostfix {

    // function to return precedence of operators
    private static int prec(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // check if character is an operator
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    // main conversion function
    public static String convert(String infix) {
        StringBuilder result = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            // skip spaces
            if (c == ' ') continue;

            // operand (letter/number)
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }

            // opening parenthesis
            else if (c == '(') {
                st.push(c);
            }

            // closing parenthesis
            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result.append(st.pop());
                }
                st.pop(); // remove '('
            }

            // operator
            else if (isOperator(c)) {
                while (!st.isEmpty() && prec(st.peek()) >= prec(c)) {
                    // for right associative operators like ^
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

    public static void main(String[] args) {
        String infix = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Postfix: " + convert(infix));
    }
}
