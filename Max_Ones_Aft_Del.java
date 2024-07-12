
// Question  --->https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/submissions/1318711877/?envType=study-plan-v2&envId=leetcode-75
package leet_code;
public class Max_Ones_Aft_Del {
    public int longestSubarray(int[] nums) {
        int ans = 0;
        int i = 0;
        int j = -1;
        int count = 0;

        while (i < nums.length) {
            if (nums[i] == 1) {
                i++;
            } else {
                i++;
                count++;
            }
            while (count > 1 && j < i) {
                j++;
                if (nums[j] == 0) {
                    count--;
                }
            }
            ans = Math.max(ans, i - j - 1);
        }
        return ans - 1; // Adjusted to handle edge cases correctly
    }

    public static void main(String[] args) {
        Max_Ones_Aft_Del solution = new Max_Ones_Aft_Del();

        int[] nums1 = {1, 1, 0, 1};
        System.out.println("Test Case 1: " + solution.longestSubarray(nums1)); // Output: 2

        int[] nums2 = {0, 0, 0};
        System.out.println("Test Case 2: " + solution.longestSubarray(nums2)); // Output: -1

        int[] nums3 = {1, 1, 1, 1};
        System.out.println("Test Case 3: " + solution.longestSubarray(nums3)); // Output: 3

        int[] nums4 = {1, 0, 1, 0, 1, 0};
        System.out.println("Test Case 4: " + solution.longestSubarray(nums4)); // Output: 2
    }
}
