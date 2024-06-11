package leet_code;


public class common_divisor {
    public String gcdOfStrings(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return gcdOfStrings(str2, str1);
        }
        if (str2.equals(str1)) {
            return str1;
        }
        if (str1.startsWith(str2)) {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
        return "";
    }

    // Main function to test the gcdOfStrings method
    public static void main(String[] args) {
        common_divisor solution = new common_divisor();

        // Test case 1
        String str1 = "ABCABC";
        String str2 = "ABC";
        String result = solution.gcdOfStrings(str1, str2);
        System.out.println("GCD of strings '" + str1 + "' and '" + str2 + "' is: '" + result + "'");  // Output should be "ABC"

        // Test case 2
        str1 = "ABABAB";
        str2 = "ABAB";
        result = solution.gcdOfStrings(str1, str2);
        System.out.println("GCD of strings '" + str1 + "' and '" + str2 + "' is: '" + result + "'");  // Output should be "AB"

        // Test case 3
        str1 = "LEET";
        str2 = "CODE";
        result = solution.gcdOfStrings(str1, str2);
        System.out.println("GCD of strings '" + str1 + "' and '" + str2 + "' is: '" + result + "'");  // Output should be ""
    }
}
