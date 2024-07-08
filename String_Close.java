package leet_code;


import java.util.*;

class String_Close {
    public boolean closeStrings(String word1, String word2) {
        // Check if the lengths of the two words are different
        if (word1.length() != word2.length())
            return false;

        // Initialize frequency counters for each letter in the alphabet
        int[] counts1 = new int[26];
        int[] counts2 = new int[26];

        // Initialize sets to keep track of unique characters in each word
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        // Count frequencies and unique characters in word1
        for (char c : word1.toCharArray()) {
            counts1[c - 'a']++;
            set1.add(c);
        }

        // Count frequencies and unique characters in word2
        for (char c : word2.toCharArray()) {
            counts2[c - 'a']++;
            set2.add(c);
        }

        // Sort the frequency arrays
        Arrays.sort(counts1);
        Arrays.sort(counts2);

        // Check if the sets of unique characters are equal
        // and if the sorted frequency arrays are equal
        return set1.equals(set2) && Arrays.equals(counts1, counts2);
    }

    public static void main(String[] args) {
        String_Close obj = new String_Close();
        
        // Test cases
        String word1 = "abc";
        String word2 = "bca";
        
        System.out.println("Are \"" + word1 + "\" and \"" + word2 + "\" close strings? " + obj.closeStrings(word1, word2)); // Should return true

        word1 = "aabbcc";
        word2 = "abcabc";
        
        System.out.println("Are \"" + word1 + "\" and \"" + word2 + "\" close strings? " + obj.closeStrings(word1, word2)); // Should return true

        word1 = "abcd";
        word2 = "abcc";
        
        System.out.println("Are \"" + word1 + "\" and \"" + word2 + "\" close strings? " + obj.closeStrings(word1, word2)); // Should return false
    }
}
