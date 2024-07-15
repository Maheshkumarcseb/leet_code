// Question-->  https://leetcode.com/problems/minimum-size-subarray-sum/?envType=study-plan-v2&envId=top-interview-150

package leet_code;


class Min_Size_Subarry {
    public int minSubArrayLen(int target, int[] nums) {
        int minLenWindow = Integer.MAX_VALUE;
        int currentSum = 0;

        // Start 2 pointers sliding window
        int low = 0;
        int high = 0;
        while (high < nums.length) {
            // Find the current sum and increase window size
            currentSum += nums[high];
            high++;

            // Try to reduce the window size
            while (currentSum >= target) {
                int currentWindowSize = high - low;

                // Update minimum length of window
                minLenWindow = Math.min(minLenWindow, currentWindowSize);

                currentSum -= nums[low];
                low++;
            }
        }

        return minLenWindow == Integer.MAX_VALUE ? 0 : minLenWindow;
    }

    public static void main(String[] args) {
        Min_Size_Subarry obj = new Min_Size_Subarry();

        // Example 1
        int target1 = 7;
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        System.out.println("Minimum length of subarray: " + obj.minSubArrayLen(target1, nums1)); // Output: 2

        // Example 2
        int target2 = 15;
        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println("Minimum length of subarray: " + obj.minSubArrayLen(target2, nums2)); // Output: 5

        // Example 3
        int target3 = 11;
        int[] nums3 = {1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println("Minimum length of subarray: " + obj.minSubArrayLen(target3, nums3)); // Output: 0
    }
}
