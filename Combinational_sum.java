// Questions---> https://leetcode.com/problems/combination-sum/?envType=study-plan-v2&envId=top-interview-150

package leet_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Combinational_sum {
    public void dfs(int[] candidates, List<List<Integer>> result, int target, List<Integer> li, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(li));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            li.add(candidates[i]);
            int newTarget = target - candidates[i];
            if (newTarget >= 0) {
                dfs(candidates, result, newTarget, li, i);
            }
            li.remove(li.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, result, target, new ArrayList<>(), 0);
        return result;
    }

    public static void main(String[] args) {
        Combinational_sum obj = new  Combinational_sum();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = obj.combinationSum(candidates, target);
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}
