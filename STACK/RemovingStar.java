/*        You are given a string s, which contains stars *.
In one operation, you can:
Choose a star in s.
Remove the closest non-star character to its left, as well as remove the star itself.
Return the string after all stars have been removed.      */


package leet_code.STACK;
import java.util.*;

class RemovingStar {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        // Iterate through the characters of the string
        for (char ch : s.toCharArray()) {
            if (ch != '*') {
                stack.push(ch); // Push the character onto the stack if it's not a '*'
            } else {
                stack.pop(); // Pop the top character if the current character is '*'
            }
        }

        // Build the result string from the stack
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        // Reverse the string and return the result
        return sb.reverse().toString();
    }

    // Main function to test the removeStars method
    public static void main(String[] args) {
        RemovingStar RemovingStarobj = new RemovingStar();

        // Test case 1
        String s1 = "leet**cod*e";
        System.out.println("Output for test case 1: " + RemovingStarobj.removeStars(s1)); // Expected: "lecoe"

        // Test case 2
        String s2 = "erase*****";
        System.out.println("Output for test case 2: " + RemovingStarobj.removeStars(s2)); // Expected: ""

        // Test case 3
        String s3 = "a*b*c*d*e*";
        System.out.println("Output for test case 3: " + RemovingStarobj.removeStars(s3)); // Expected: ""

        // Test case 4
        String s4 = "ab**cd*";
        System.out.println("Output for test case 4: " + RemovingStarobj.removeStars(s4)); // Expected: "c"

        // Additional test case
        String s5 = "abc***d*e*f*";
        System.out.println("Output for additional test case: " + RemovingStarobj.removeStars(s5)); // Expected: ""
    }
}
