// Question--->https://leetcode.com/problems/two-sum/?envType=study-plan-v2&envId=top-interview-150

package leet_code;

import java.util.HashMap;
import java.util.Map;

public class Two_sum{
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        Two_sum solution = new Two_sum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        try {
            int[] result = Two_sum.twoSum(nums, target);
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Additional test cases
        nums = new int[]{3, 2, 4};
        target = 6;

        try {
            int[] result = Two_sum.twoSum(nums, target);
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

