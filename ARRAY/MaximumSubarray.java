package leet_code.ARRAY;


import java.util.Scanner;

public class MaximumSubarray {

  public int maxSubArray(int[] nums) {
    int max_so_far = nums[0];
    int curr_max = nums[0];

    for (int i = 1; i < nums.length; i++) {
      curr_max = Math.max(nums[i], nums[i] + curr_max);
      max_so_far = Math.max(curr_max, max_so_far);
    }

    return max_so_far;
  }

  // Main method to run the program
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of elements in the array:");
    int n = scanner.nextInt();
    int[] nums = new int[n];

    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      nums[i] = scanner.nextInt();
    }

    // Create an instance of the MaximumSubarray class
    MaximumSubarray maximumSubarray = new MaximumSubarray();

    // Call the maxSubArray method and print the result
    int result = maximumSubarray.maxSubArray(nums);
    System.out.println("The maximum subarray sum is: " + result);

    scanner.close();
  }
}

// time complexity:-O(n)
// space complexity:-O(1)
