package leet_code;

public class Reverse_Sentence{
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        int startIndex = s.length() - 1;

        while (startIndex >= 0) {
            // Skip spaces
            while (startIndex >= 0 && s.charAt(startIndex) == ' ') {
                startIndex--;
            }
            if (startIndex < 0) {
                break;
            }

            int endIndex = startIndex;
            // Find the start of the word
            while (startIndex >= 0 && s.charAt(startIndex) != ' ') {
                startIndex--;
            }
            
            if (res.length() == 0) {
                res.append(s.substring(startIndex + 1, endIndex + 1));
            } else {
                res.append(" ");
                res.append(s.substring(startIndex + 1, endIndex + 1));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Reverse_Sentence obj = new Reverse_Sentence();

        // Test case 1
        String s1 = "the sky is blue";
        System.out.println("Test case 1: " + obj.reverseWords(s1)); // Output: "blue is sky the"

        // Test case 2
        String s2 = "  hello world  ";
        System.out.println("Test case 2: " + obj.reverseWords(s2)); // Output: "world hello"

        // Test case 3
        String s3 = "a good   example";
        System.out.println("Test case 3: " + obj.reverseWords(s3)); // Output: "example good a"

        // Test case 4
        String s4 = "  Bob    Loves  Alice   ";
        System.out.println("Test case 4: " + obj.reverseWords(s4)); // Output: "Alice Loves Bob"

        // Test case 5
        String s5 = "Alice does not even like bob";
        System.out.println("Test case 5: " + obj.reverseWords(s5)); // Output: "bob like even not does Alice"
    }
}
