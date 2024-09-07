package leet_code.STRING;

import java.util.HashSet;
import java.util.Set;

public class CheckIfPangram {

  // Method to check if a given sentence is a pangram
  boolean checkIfPangram(String sentence) {

    Set<Character> alphabetSet = new HashSet<>();

    // Add all characters from 'a' to 'z' into the hashset
    for (int i = 'a'; i <= 'z'; i++) {
      alphabetSet.add((char) i);
    }

    // Remove each character from the set if it exists in the sentence
    for (int i = 0; i < sentence.length(); i++) {
      alphabetSet.remove(sentence.charAt(i));
      if (alphabetSet.isEmpty())
        return true;  // If all characters are found, it's a pangram
    }

    return false;  // Return false if the set is not empty
  }

  // Main method to test the function
  public static void main(String[] args) {
    CheckIfPangram pangramChecker = new CheckIfPangram();

    // Test case 1: Sentence with all letters of the alphabet
    String sentence1 = "the quick brown fox jumps over a lazy dog";
    boolean result1 = pangramChecker.checkIfPangram(sentence1);
    System.out.println("Is the sentence a pangram? " + result1);  // Output: true

    // Test case 2: Sentence missing some letters
    String sentence2 = "hello world";
    boolean result2 = pangramChecker.checkIfPangram(sentence2);
    System.out.println("Is the sentence a pangram? " + result2);  // Output: false
  }
}
