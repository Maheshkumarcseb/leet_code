package leet_code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Letter_Phone_No{
    void help(int i, String s, String temp, List<String> ans, HashMap<Character, String> m) {
        if (i == s.length()) {
            ans.add(temp);
            return;
        }
        char chr = s.charAt(i);
        String str = m.get(chr);
        for (int j = 0; j < str.length(); j++) {
            char c = str.charAt(j);
            help(i + 1, s, temp + c, ans, m);
        }
    }

    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> m = new HashMap<>();
        m.put('2', "abc");
        m.put('3', "def");
        m.put('4', "ghi");
        m.put('5', "jkl");
        m.put('6', "mno");
        m.put('7', "pqrs");
        m.put('8', "tuv");
        m.put('9', "wxyz");

        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }
        String temp = "";
        help(0, digits, temp, ans, m);
        return ans;
    }

    public static void main(String[] args) {
        Letter_Phone_No solution = new Letter_Phone_No();
        String digits = "23";
        List<String> result = solution.letterCombinations(digits);
        System.out.println(result);  // Output: [ad, ae, af, bd, be, bf, cd, ce, cf]
    }
}
