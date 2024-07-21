// https://leetcode.com/problems/zigzag-conversion/submissions/1328040402/?envType=study-plan-v2&envId=top-interview-150
// The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
//  (you may want to display this pattern in a fixed font for better legibility)

// P   A   H   N
// A P L S I I G
// Y   I   R
// And then read line by line: "PAHNAPLSIIGYIR"

package leet_code;
public class Zigzag_Conversion {

    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder res = new StringBuilder();
        int increment = 2 * (numRows - 1);

        for (int r = 0; r < numRows; r++) {
            for (int i = r; i < s.length(); i += increment) {
                res.append(s.charAt(i));
                if (r > 0 && r < numRows - 1 && i + increment - 2 * r < s.length()) {
                    res.append(s.charAt(i + increment - 2 * r));
                }
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        Zigzag_Conversion obj = new Zigzag_Conversion();
        
        // Example usage
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println("Converted string: " + obj.convert(s, numRows));  // Output: "PAHNAPLSIIGYIR"
        
        String s2 = "PAYPALISHIRING";
        int numRows2 = 4;
        System.out.println("Converted string: " + obj.convert(s2, numRows2));  // Output: "PINALSIGYAHRPI"
    }
}
