package leet_code;

import java.util.HashMap;
import java.util.Map;

class Ransom_note {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if (map.containsKey(ch) && map.get(ch) > 0) {
                map.put(ch, map.get(ch) - 1);
            } else {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Ransom_note ransomNoteChecker = new Ransom_note();
        
        String ransomNote1 = "a";
        String magazine1 = "b";
        System.out.println(ransomNoteChecker.canConstruct(ransomNote1, magazine1)); // Output: false
        
        String ransomNote2 = "aa";
        String magazine2 = "ab";
        System.out.println(ransomNoteChecker.canConstruct(ransomNote2, magazine2)); // Output: false
        
        String ransomNote3 = "aa";
        String magazine3 = "aab";
        System.out.println(ransomNoteChecker.canConstruct(ransomNote3, magazine3)); // Output: true
    }
}
