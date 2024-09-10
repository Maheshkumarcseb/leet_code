package leet_code.ARRAY;
import java.util.Scanner;

public class SingleNumber {

  // Method to find the single number using XOR
  public int singleNumber(int[] nums) {
    int sing = nums[0];
    
    // XOR all numbers in the array
    for (int i = 1; i < nums.length; i++) {
      sing = sing ^ nums[i];  // XOR operation
    }
    
    return sing;
  }

  // Main function to run the program
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of elements in the array:");
    int n = scanner.nextInt();

    int[] nums = new int[n];
    System.out.println("Enter the array elements (integers):");
    for (int i = 0; i < n; i++) {
      nums[i] = scanner.nextInt();
    }

    // Create an object of SingleNumber class and call the singleNumber method
    SingleNumber singleNumber = new SingleNumber();
    int result = singleNumber.singleNumber(nums);

    System.out.println("The single number in the array is: " + result);

    scanner.close();
  }
}

// by using xor Method:-
// time complexity=O(n)
// space complexity=O(1)


// by using hashmap method:-
// time complexity=O(n)
// space complexity=O(n)

// by bruteforce method:-
// time complexity=O(n^2)
// space complexity=O(1)


