// QUESTION---->https://leetcode.com/problems/word-pattern/?envType=study-plan-v2&envId=top-interview-150

package leet_code;

import java.util.HashMap;

public class Word_Pattern {
    public static void main(String[] args) {
        String pattern1 = "abba";
        String s1 = "dog cat cat dog";
        System.out.println(WordPattern(pattern1, s1));

        String pattern2 = "abba";
        String s2 = "dog cat cat fish";
        System.out.println(WordPattern(pattern2, s2));

        String pattern3 = "aaaa";
        String s3 = "dog cat cat dog";
        System.out.println(WordPattern(pattern3, s3));
    }

    public static boolean WordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) {
            return false;
        }
        HashMap<Character, String> hm = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            boolean containsKey = hm.containsKey(ch);
            if (hm.containsValue(arr[i]) && !containsKey) {
                return false;
            }
            if (containsKey && !hm.get(ch).equals(arr[i])) {
                return false;
            } else {
                hm.put(ch, arr[i]);
            }
        }
        return true;
    }
}
