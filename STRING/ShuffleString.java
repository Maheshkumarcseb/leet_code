package leet_code.STRING;



public class ShuffleString {

  // Method to restore the shuffled string based on the given indices
  String restoreString(String s, int[] indices) {

    // Character array to form final string
    char[] str = new char[s.length()];

    // Place characters in their correct positions based on indices array
    for (int i = 0; i < s.length(); i++) {
      str[indices[i]] = s.charAt(i);
    }

    // Return the restored string
    return String.valueOf(str);
  }

  // Main method to test the function
  public static void main(String[] args) {
    ShuffleString shuffle = new ShuffleString();

    // Test case 1
    String s1 = "codeleet";
    int[] indices1 = {4, 5, 6, 7, 0, 2, 1, 3};
    String result1 = shuffle.restoreString(s1, indices1);
    System.out.println("Restored string (Test 1): " + result1); // Output: "leetcode"

    // Test case 2
    String s2 = "abc";
    int[] indices2 = {0, 1, 2};
    String result2 = shuffle.restoreString(s2, indices2);
    System.out.println("Restored string (Test 2): " + result2); // Output: "abc"
  }
}
