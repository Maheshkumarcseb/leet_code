// Question--->https://leetcode.com/problems/generate-parentheses/?envType=study-plan-v2&envId=top-interview-150

package leet_code;

import java.util.ArrayList;
import java.util.List;

public class Generate_parenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        backtrack(res, sb, 0, 0, n);
        return res;
    }

    private void backtrack(List<String> res, StringBuilder sb, int openN, int closedN, int n) {
        if (openN == closedN && openN == n) {
            res.add(sb.toString());
            return;
        }
        if (openN < n) {
            sb.append('(');
            backtrack(res, sb, openN + 1, closedN, n);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (closedN < openN) {
            sb.append(')');
            backtrack(res, sb, openN, closedN + 1, n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        Generate_parenthesis obj = new Generate_parenthesis();
        int n = 3;
        List<String> result = obj.generateParenthesis(n);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
