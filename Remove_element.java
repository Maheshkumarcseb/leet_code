// Questions--->https://leetcode.com/problems/remove-element/

package leet_code;

public class Remove_element {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Remove_element solution = new Remove_element();
        
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int newLength = solution.removeElement(nums, val);

        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // Additional test case
        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        val = 2;
        newLength = solution.removeElement(nums, val);

        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}