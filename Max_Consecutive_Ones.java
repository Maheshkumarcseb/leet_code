package leet_code;


public class Max_Consecutive_Ones{

    public int longestOnes(int[] nums, int k) {
        int zeroCount = 0;
        int start = 0;
        int maxOnes = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0)
                zeroCount++;
            while (zeroCount > k) {
                if (nums[start] == 0)
                    zeroCount--;
                start++;
            }
            maxOnes = Math.max(maxOnes, end - start + 1);
        }
        return maxOnes;
    }

    public static void main(String[] args) {
        Max_Consecutive_Ones obj = new Max_Consecutive_Ones();

        int[] nums1 = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k1 = 2;
        System.out.println("Test Case 1: " + obj.longestOnes(nums1, k1));  // Output: 6

        int[] nums2 = {0, 0, 1, 1, 1, 0, 0};
        int k2 = 0;
        System.out.println("Test Case 2: " + obj.longestOnes(nums2, k2));  // Output: 3

        int[] nums3 = {0, 0, 0, 0, 0, 0};
        int k3 = 3;
        System.out.println("Test Case 3: " + obj.longestOnes(nums3, k3));  // Output: 3

        int[] nums4 = {1, 1, 1, 1, 1, 1};
        int k4 = 2;
        System.out.println("Test Case 4: " + obj.longestOnes(nums4, k4));  // Output: 6
    }
}
