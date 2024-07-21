// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=study-plan-v2&envId=top-interview-150

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Input: haystack = "leetcode", needle = "leeto"
// Output: -1


package leet_code;
public class First_Occurance {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        First_Occurance obj = new First_Occurance();

        // Test cases
        System.out.println(obj.strStr("hello", "ll"));  // Output: 2
        System.out.println(obj.strStr("aaaaa", "bba")); // Output: -1
        System.out.println(obj.strStr("hello", ""));    // Output: 0
        System.out.println(obj.strStr("", ""));         // Output: 0
        System.out.println(obj.strStr("", "a"));        // Output: -1
        System.out.println(obj.strStr("abc", "c"));     // Output: 2
    }
}
