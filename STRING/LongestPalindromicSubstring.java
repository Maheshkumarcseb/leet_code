package leet_code.STRING;
class LongestPalindromicSubstring {

    String longestPalindrome(String str) {

        if (str.length() <= 1)
            return str;

        String LPS = "";

        for (int i = 1; i < str.length(); i++) {

            // Consider odd length
            int low = i;
            int high = i;
            while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {
                low--;
                high++;

                if (low == -1 || high == str.length())
                    break;
            }

            String palindrome = str.substring(low + 1, high);
            if (palindrome.length() > LPS.length()) {
                LPS = palindrome;
            }

            // Consider even length
            low = i - 1;
            high = i;
            while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {
                low--;
                high++;

                if (low == -1 || high == str.length())
                    break;
            }

            palindrome = str.substring(low + 1, high);
            if (palindrome.length() > LPS.length()) {
                LPS = palindrome;
            }
        }

        return LPS;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        String str = "babad";
        System.out.println("Longest Palindromic Substring of \"" + str + "\" is: " + lps.longestPalindrome(str));

        str = "cbbd";
        System.out.println("Longest Palindromic Substring of \"" + str + "\" is: " + lps.longestPalindrome(str));

        str = "a";
        System.out.println("Longest Palindromic Substring of \"" + str + "\" is: " + lps.longestPalindrome(str));

        str = "ac";
        System.out.println("Longest Palindromic Substring of \"" + str + "\" is: " + lps.longestPalindrome(str));
    }
}
