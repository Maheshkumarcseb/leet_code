package leet_code;

public class Valid_Anagram{
    public boolean isAnagram(String str1, String str2) {
        // Convert both to lowercase to ignore case match
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Strip off all the white spaces
        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        // Initialize the bucket array
        int[] counts = new int[26];

        // Fill the buckets
        for (int i = 0; i < str1.length(); i++) {
            counts[str1.charAt(i) - 'a']++;
        }

        // Empty the buckets
        for (int i = 0; i < str2.length(); i++) {
            counts[str2.charAt(i) - 'a']--;
        }

        // Check if all buckets are empty
        for (int count : counts) {
            if (count != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Valid_Anagram solution = new Valid_Anagram();
        String str1 = "Listen";
        String str2 = "Silent";

        if (solution.isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

        // Additional test cases
        String str3 = "Hello";
        String str4 = "Olelh";

        if (solution.isAnagram(str3, str4)) {
            System.out.println(str3 + " and " + str4 + " are anagrams.");
        } else {
            System.out.println(str3 + " and " + str4 + " are not anagrams.");
        }
    }
}
