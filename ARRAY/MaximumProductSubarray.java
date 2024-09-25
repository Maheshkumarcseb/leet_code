package leet_code.ARRAY;

public class MaximumProductSubarray {

    int maxProduct(int[] nums) {
        int n = nums.length;
        long leftProduct = 1;
        long rightProduct = 1;
        long ans = nums[0];

        for (int i = 0; i < n; i++) {
            // If any of leftProduct or rightProduct become 0 then update it to 1
            leftProduct = (leftProduct == 0) ? 1 : leftProduct;
            rightProduct = (rightProduct == 0) ? 1 : rightProduct;

            // Prefix product
            leftProduct *= nums[i];

            // Suffix product
            rightProduct *= nums[n - 1 - i];

            ans = Math.max(ans, Math.max(leftProduct, rightProduct));
        }

        return (int) ans;
    }

    public static void main(String[] args) {
        MaximumProductSubarray mps = new MaximumProductSubarray();

        // Example test case
        int[] nums = {2, 3, -2, 4};
        int result = mps.maxProduct(nums);
        
        System.out.println("The maximum product of a contiguous subarray is: " + result);
        
        // Additional test cases
        int[] nums2 = {-2, 0, -1};
        System.out.println("The maximum product of a contiguous subarray is: " + mps.maxProduct(nums2));

        int[] nums3 = {1, 2, 3, 4};
        System.out.println("The maximum product of a contiguous subarray is: " + mps.maxProduct(nums3));

        int[] nums4 = {-1, -3, -10, 0, 60};
        System.out.println("The maximum product of a contiguous subarray is: " + mps.maxProduct(nums4));
    }
}
