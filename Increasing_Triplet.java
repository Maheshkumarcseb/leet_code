package leet_code;


public class Increasing_Triplet{
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;

        int i = Integer.MAX_VALUE, j = Integer.MAX_VALUE;  // MAX_VALUE is a constant in the Integer class
                                                            // that holds the maximum possible value for an integer, which is 2,147,483,647
        for (int in = 0; in < nums.length; in++) {
            if (nums[in] <= i) {
                i = nums[in];
            } else if (nums[in] <= j) {
                j = nums[in];
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Increasing_Triplet obj = new Increasing_Triplet();

        // Test case 1
        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println("Test case 1: " + obj.increasingTriplet(nums1)); // Output: true

        // Test case 2
        int[] nums2 = {5, 4, 3, 2, 1};
        System.out.println("Test case 2: " + obj.increasingTriplet(nums2)); // Output: false

        // Test case 3
        int[] nums3 = {2, 1, 5, 0, 4, 6};
        System.out.println("Test case 3: " + obj.increasingTriplet(nums3)); // Output: true

        // Test case 4
        int[] nums4 = {1, 2};
        System.out.println("Test case 4: " + obj.increasingTriplet(nums4)); // Output: false

        // Test case 5
        int[] nums5 = {20, 100, 10, 12, 5, 13};
        System.out.println("Test case 5: " + obj.increasingTriplet(nums5)); // Output: true
    }
}
