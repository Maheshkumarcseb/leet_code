package leet_code.STRING;

import java.util.Arrays;

/*  brute force method
time complexity:-O(mxn)
n be the number of strings in the array.
m be the length of the shortest string in the array.

*/



/*
public class LongestCommonPrefix {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        String[] str = {"cluster", "clue", "clutch", "club", "clumsy"};

        if (str == null || str.length == 0) {
            System.out.println(result);
            return;
        }

        // Take the first string as the reference for comparison
        String reference = str[0];
        int index = 0;

        // Iterate through each character of the reference string
        while (index < reference.length()) {
            char currentChar = reference.charAt(index);

            // Check if this character matches across all strings
            for (int i = 1; i < str.length; i++) {
                // If index exceeds any string length or characters do not match
                if (index >= str[i].length() || str[i].charAt(index) != currentChar) {
                    System.out.println(result);
                    return;
                }
            }

            // If all strings have the same character at this index, append it to the result
            result.append(currentChar);
            index++;
        }

        System.out.println(result);
    }
}

*/


/* 
 
optimized solutions
time complexity --O(nlogn)  for sorting the string
*/


public class LongestCommonPrefix{
    public static String longestCommonPrefix(String[] strs)
    {
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length -1].toCharArray();

        for(int i=0;i<first.length;i++)
        {
            if(first[i] != last[i])
                break;
            result.append(first[i]);
        }
        return result.toString();
        }
    public static void main(String[] args) {
        String[] str = {"cluster", "clue", "clutch", "club", "clumsy"};
        String res=longestCommonPrefix(str);
        System.out.println(res);
        
    }
}


