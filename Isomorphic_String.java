package leet_code;

import java.util.HashMap;   // for storing the character of both string
import java.util.Map;

public class Isomorphic_String {

    public static void main(String[] args) {
        Isomorphic_String checker = new Isomorphic_String();
        
        String s1 = "egg";
        String t1 = "add";
        System.out.println(checker.isIsomorphic(s1, t1)); // Output: true

        String s2 = "foo";
        String t2 = "bar";
        System.out.println(checker.isIsomorphic(s2, t2)); // Output: false

        String s3 = "paper";
        String t3 = "title";
        System.out.println(checker.isIsomorphic(s3, t3)); // Output: true
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> charMapping = new HashMap<>();  // it stores the character in key-value form.

        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);                 // charAt() is used to fetch the ith element of the given string.
            char replacement = t.charAt(i);

            if (!charMapping.containsKey(original)) {
                if (!charMapping.containsValue(replacement)) {      // charMapping is the name of the hashmap.
                    charMapping.put(original, replacement);
                } else {
                    return false;
                }
            } else {
                char mappedCharacter = charMapping.get(original);
                if (mappedCharacter != replacement) {
                    return false;
                }
            }
        }
        return true;
    }
}
