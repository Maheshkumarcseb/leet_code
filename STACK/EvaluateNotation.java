package leet_code.STACK;
import java.util.Stack;
class EvaluateNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        String operators = "+-*/";

        for (String token : tokens) {
            if (operators.indexOf(token) != -1) {
                int d2 = st.pop();
                int d1 = st.pop();
                int res = 0;
                if (token.equals("+"))
                    res = d1 + d2;
                else if (token.equals("-"))
                    res = d1 - d2;
                else if (token.equals("*"))
                    res = d1 * d2;
                else if (token.equals("/"))
                    res = d1 / d2;
                st.push(res);
            } else {
                st.push(Integer.parseInt(token));
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        EvaluateNotation evaluateobj = new EvaluateNotation();

        // Test cases
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        String[] tokens2 = {"4", "13", "5", "/", "+"};
        String[] tokens3 = {"10", "6", "9", "3", "/", "-", "11", "+", "*", "2", "/"};

        // Outputs
        System.out.println("Result of tokens1: " + evaluateobj.evalRPN(tokens1)); // (2 + 1) * 3 = 9
        System.out.println("Result of tokens2: " + evaluateobj.evalRPN(tokens2)); // 4 + (13 / 5) = 6
        System.out.println("Result of tokens3: " + evaluateobj.evalRPN(tokens3)); // ((10 - (6 / 3)) + 11) * 2 = 30
    }
}
