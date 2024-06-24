public class MoveZeroes {

  public void moveZeroes(int[] nums) {
      // Start with the first position
      int insertPosition = 0;

      for (int i = 0; i < nums.length; i++) {
          // Fill all non-zero numbers
          if (nums[i] != 0) {
              nums[insertPosition] = nums[i];
              insertPosition++;
          }
      }

      // Fill remaining positions with zeros
      while (insertPosition < nums.length) {
          nums[insertPosition++] = 0;
      }
  }

  public static void main(String[] args) {
      MoveZeroes moveZeroes = new MoveZeroes();

      int[] nums = {0, 1, 0, 3, 12};
      System.out.println("Original array:");
      for (int num : nums) {
          System.out.print(num + " ");
      }

      moveZeroes.moveZeroes(nums);

      System.out.println("\nArray after moving zeroes:");
      for (int num : nums) {
          System.out.print(num + " ");
      }
  }
}
