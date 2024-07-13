package leet_code;
import java.util.HashSet;
import java.util.Set;

public class Max_no_vowel_substring {
    public int maxVowels(String s, int k) {
        int maxVowels = 0;
        int windowVowels = 0;

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        // Count the number of vowels in the first window
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                windowVowels++;
            }
        }

        maxVowels = windowVowels;

        // Slide the window and update the maximum number of vowels
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i - k))) {
                windowVowels--;
            }

            if (vowels.contains(s.charAt(i))) {
                windowVowels++;
            }

            maxVowels = Math.max(maxVowels, windowVowels);
        }

        return maxVowels;
    }

    public static void main(String[] args) {
        Max_no_vowel_substring obj = new Max_no_vowel_substring();

        // Test case 1
        String s1 = "abciiidef";
        int k1 = 3;
        System.out.println("Max vowels in " + s1 + " with window size " + k1 + ": " + obj.maxVowels(s1, k1)); // Output: 3

        // Test case 2
        String s2 = "aeiou";
        int k2 = 2;
        System.out.println("Max vowels in " + s2 + " with window size " + k2 + ": " + obj.maxVowels(s2, k2)); // Output: 2

        // Test case 3
        String s3 = "leetcode";
        int k3 = 3;
        System.out.println("Max vowels in " + s3 + " with window size " + k3 + ": " + obj.maxVowels(s3, k3)); // Output: 2

        // Test case 4
        String s4 = "rhythms";
        int k4 = 4;
        System.out.println("Max vowels in " + s4 + " with window size " + k4 + ": " + obj.maxVowels(s4, k4)); // Output: 0

        // Test case 5
        String s5 = "tryhard";
        int k5 = 4;
        System.out.println("Max vowels in " + s5 + " with window size " + k5 + ": " + obj.maxVowels(s5, k5)); // Output: 1
    }
}
