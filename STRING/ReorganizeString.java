package leet_code.STRING;




import java.util.Scanner;

public class ReorganizeString {

  // Method to reorganize the string
  public String reorganizeString(String str) {
    int[] hash = new int[26];
    for (int i = 0; i < str.length(); i++) 
      hash[str.charAt(i) - 'a']++;

    int max = 0, letter = 0;
    for (int i = 0; i < hash.length; i++) {
      if (hash[i] > max) {
        max = hash[i];
        letter = i;
      }
    }

    // If the most frequent character appears more than half the length of the string, it's impossible to reorganize
    if (max > (str.length() + 1) / 2) 
      return "";

    char[] res = new char[str.length()];

    // Fill all even places with the majority character
    int idx = 0;
    while (hash[letter]-- > 0) {
      res[idx] = (char) (letter + 'a');
      idx += 2;
    }

    // Fill the remaining characters
    for (int i = 0; i < hash.length; i++) {
      while (hash[i]-- > 0) {
        if (idx >= res.length) idx = 1;

        res[idx] = (char) (i + 'a');
        idx += 2;
      }
    }

    return String.valueOf(res);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a string to reorganize:");
    String input = scanner.nextLine();

    ReorganizeString reorganizeString = new ReorganizeString();
    String result = reorganizeString.reorganizeString(input);

    if (result.isEmpty()) {
      System.out.println("It's impossible to reorganize the string.");
    } else {
      System.out.println("The reorganized string is: " + result);
    }

    scanner.close();
  }
}
