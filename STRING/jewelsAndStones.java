
package leet_code.STRING;

import java.util.HashSet;
import java.util.Set;

public class jewelsAndStones {

  // Function to calculate the number of jewels in the stones
  int numJewelsInStones(String jewels, String stones) {

    // Create a set for all different jewels
    Set<Character> jewelSet = new HashSet<>();
    for (int i = 0; i < jewels.length(); i++)
      jewelSet.add(jewels.charAt(i));

    // Find total score/value
    int score = 0;
    for (int i = 0; i < stones.length(); i++)
      if (jewelSet.contains(stones.charAt(i)))
        score++;

    return score;
  }

  // Main method to test the function
  public static void main(String[] args) {
    JewelsAndStones js = new JewelsAndStones();

    String jewels1 = "aA";
    String stones1 = "aAAbbbb";
    int result1 = js.numJewelsInStones(jewels1, stones1);
    System.out.println("Number of jewels in stones (Test 1): " + result1); // Output: 3

    String jewels2 = "z";
    String stones2 = "ZZ";
    int result2 = js.numJewelsInStones(jewels2, stones2);
    System.out.println("Number of jewels in stones (Test 2): " + result2); // Output: 0
  }
}
