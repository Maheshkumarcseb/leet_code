package leet_code.STRING;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public int firstUniqueChar(String str) {
        int index = -1;
        Map<Character, Integer> charFreqMap = new HashMap<>();
        
        // Fill the frequency map
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int freq = charFreqMap.getOrDefault(c, 0);
            charFreqMap.put(c, freq + 1);
        }
        
        // Find the first unique character
        for (int i = 0; i < str.length(); i++) {
            if (charFreqMap.get(str.charAt(i)) == 1) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        FirstUniqueCharacter firstUnique = new FirstUniqueCharacter();
        String str = "leetcode";
        int result = firstUnique.firstUniqueChar(str);
        System.out.println("The index of the first unique character in \"" + str + "\" is: " + result);

        str = "loveleetcode";
        result = firstUnique.firstUniqueChar(str);
        System.out.println("The index of the first unique character in \"" + str + "\" is: " + result);

        str = "aabb";
        result = firstUnique.firstUniqueChar(str);
        System.out.println("The index of the first unique character in \"" + str + "\" is: " + result);
    }
}
