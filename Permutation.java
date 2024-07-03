// Questions---> https://leetcode.com/problems/permutations/submissions/1308483344/?envType=study-plan-v2&envId=top-interview-150

package leet_code;

import java.util.ArrayList;
import java.util.List;

class permutation {
    private void backtrack(List<List<Integer>> resultList, ArrayList<Integer> tempList, int[] nums) {
        // If we match the length, it is a permutation
        if (tempList.size() == nums.length) {
            resultList.add(new ArrayList<>(tempList));
            return;
        }

        for (int number : nums) {
            // Skip if we get the same element
            if (tempList.contains(number))
                continue;

            // Add the new element
            tempList.add(number);

            // Go back to try another element
            backtrack(resultList, tempList, nums);

            // Remove the element
            tempList.remove(tempList.size() - 1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(resultList, new ArrayList<>(), nums);
        return resultList;
    }

    public static void main(String[] args) {
        permutation obj = new permutation();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = obj.permute(nums);
        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }
    }
}
