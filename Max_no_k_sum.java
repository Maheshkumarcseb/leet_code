// Question--->https://leetcode.com/problems/max-number-of-k-sum-pairs/?envType=study-plan-v2&envId=leetcode-75

package leet_code;


import java.util.Arrays;

public class Max_no_k_sum {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] + nums[right] < k) {
                left++;
            } else if (nums[left] + nums[right] > k) {
                right--;
            } else {
                left++;
                right--;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Max_no_k_sum obj = new Max_no_k_sum();

        // Test case 1
        int[] nums1 = {1, 2, 3, 4};
        int k1 = 5;
        System.out.println("Max operations for nums1: " + obj.maxOperations(nums1, k1)); // Output: 2

        // Test case 2
        int[] nums2 = {3, 1, 3, 4, 3};
        int k2 = 6;
        System.out.println("Max operations for nums2: " + obj.maxOperations(nums2, k2)); // Output: 1

        // Test case 3
        int[] nums3 = {1, 2, 3, 4, 5, 6};
        int k3 = 7;
        System.out.println("Max operations for nums3: " + obj.maxOperations(nums3, k3)); // Output: 3

        // Test case 4
        int[] nums4 = {1, 1, 1, 1};
        int k4 = 2;
        System.out.println("Max operations for nums4: " + obj.maxOperations(nums4, k4)); // Output: 2

        // Test case 5
        int[] nums5 = {1, 5, 7, -1, 5};
        int k5 = 6;
        System.out.println("Max operations for nums5: " + obj.maxOperations(nums5, k5)); // Output: 2
    }
}
