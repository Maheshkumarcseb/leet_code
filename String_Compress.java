//Question---->  https://leetcode.com/problems/string-compression/?envType=study-plan-v2&envId=leetcode-75

package leet_code;


public class String_Compress {
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;
        while (i < chars.length) {
            int j = i;
            while (j < chars.length && chars[j] == chars[i]) {
                j++;
            }
            chars[index++] = chars[i];
            if (j - i > 1) {
                String count = j - i + "";
                //toCharArray() method converts the given string into a sequence of characters.
                for (char c : count.toCharArray()) { 
                    chars[index++] = c;
                }
            }
            i = j;
        }
        return index;
    }

    public static void main(String[] args) {
        String_Compress obj = new String_Compress();

        // Test case 1
        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength1 = obj.compress(chars1);
        System.out.println("Compressed length: " + newLength1);
        System.out.print("Compressed array: ");
        for (int i = 0; i < newLength1; i++) {
            System.out.print(chars1[i]);
        }
        System.out.println();

        // Test case 2
        char[] chars2 = {'a'};
        int newLength2 = obj.compress(chars2);
        System.out.println("Compressed length: " + newLength2);
        System.out.print("Compressed array: ");
        for (int i = 0; i < newLength2; i++) {
            System.out.print(chars2[i]);
        }
        System.out.println();

        // Test case 3
        char[] chars3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        int newLength3 = obj.compress(chars3);
        System.out.println("Compressed length: " + newLength3);
        System.out.print("Compressed array: ");
        for (int i = 0; i < newLength3; i++) {
            System.out.print(chars3[i]);
        }
        System.out.println();
    }
}
