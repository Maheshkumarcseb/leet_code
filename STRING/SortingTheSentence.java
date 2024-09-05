import java.util.HashMap;
import java.util.Map;

public class SortingTheSentence {

  String sortSentence(String s) {

    // Map to store words in correct order
    Map<Integer, String> indexWordMap = new HashMap<>();

    // Split each word based on space
    for (String word : s.split(" ")) {
      int lastIndex = word.length() - 1;

      // Get the word and index separately
      int index = word.charAt(lastIndex) - '0';
      String actualWord = word.substring(0, lastIndex);

      indexWordMap.put(index, actualWord);
    }

    // Build the actual string
    StringBuilder actualString = new StringBuilder();
    for (Map.Entry<Integer, String> indexWord : indexWordMap.entrySet()) {
      actualString.append(indexWord.getValue());
      actualString.append(" ");
    }

    return actualString.toString().trim();
  }

  public static void main(String[] args) {
    SortingTheSentence sorter = new SortingTheSentence();

    // Test case 1
    String sentence1 = "is2 sentence4 This1 a3";
    String result1 = sorter.sortSentence(sentence1);
    System.out.println("Sorted sentence: " + result1); // Expected output: "This is a sentence"

    // Test case 2
    String sentence2 = "Myself2 Me1 I4 and3";
    String result2 = sorter.sortSentence(sentence2);
    System.out.println("Sorted sentence: " + result2); // Expected output: "Me Myself and I"
  }
}
