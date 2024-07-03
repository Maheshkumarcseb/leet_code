
// Questions--->https://leetcode.com/problems/combinations/description/?envType=study-plan-v2&envId=top-interview-150

package leet_code;

import java.util.ArrayList;
import java.util.List;

class Combination77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), 1, n, k);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> comb, int start, int n, int k) {
        if (comb.size() == k) {
            res.add(new ArrayList<>(comb));
            return;
        }

        for (int i = start; i <= n; i++) {
            comb.add(i);
            backtrack(res, comb, i + 1, n, k);
            comb.remove(comb.size() - 1);
        }
    }

    public static void main(String[] args) {
        Combination77 obj = new  Combination77();
        int n = 4;
        int k = 2;
        List<List<Integer>> result = obj.combine(n, k);
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}