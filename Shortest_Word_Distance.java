package leet_code;

public class Shortest_Word_Distance {
    public int shortestDistance(String[] words, String word1, String word2) {
        int index1 = -1, index2 = -1, min = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1))
                index1 = i;
            if (words[i].equals(word2))
                index2 = i;
            if (index1 != -1 && index2 != -1)
                min = Math.min(min, Math.abs(index1 - index2));
        }
        return min;
    }

    public static void main(String[] args) {
        Shortest_Word_Distance solution = new Shortest_Word_Distance();

        // Test case 1
        String[] words1 = {"practice", "makes", "perfect", "coding", "makes"};
        String word1_1 = "coding";
        String word2_1 = "practice";
        int result1 = solution.shortestDistance(words1, word1_1, word2_1);
        System.out.println("Shortest distance between 'coding' and 'practice': " + result1);  // Output: 3

        // Test case 2
        String[] words2 = {"practice", "makes", "perfect", "coding", "makes"};
        String word1_2 = "makes";
        String word2_2 = "coding";
        int result2 = solution.shortestDistance(words2, word1_2, word2_2);
        System.out.println("Shortest distance between 'makes' and 'coding': " + result2);  // Output: 1

        // Test case 3
        String[] words3 = {"a", "c", "d", "b", "a"};
        String word1_3 = "a";
        String word2_3 = "b";
        int result3 = solution.shortestDistance(words3, word1_3, word2_3);
        System.out.println("Shortest distance between 'a' and 'b': " + result3);  // Output: 1
    }
}
