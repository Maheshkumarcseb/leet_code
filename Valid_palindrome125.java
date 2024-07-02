// Question---> https://leetcode.com/problems/valid-palindrome/submissions/1307260902/?envType=study-plan-v2&envId=top-interview-150


package leet_code;

class Valid_palindrome125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Valid_palindrome125 solution = new Valid_palindrome125();
        
        // Test cases
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = "No lemon, no melon";
        String test4 = "Able was I, I saw Elba";

        System.out.println("\"" + test1 + "\" is a palindrome: " + solution.isPalindrome(test1));
        System.out.println("\"" + test2 + "\" is a palindrome: " + solution.isPalindrome(test2));
        System.out.println("\"" + test3 + "\" is a palindrome: " + solution.isPalindrome(test3));
        System.out.println("\"" + test4 + "\" is a palindrome: " + solution.isPalindrome(test4));
    }
}
