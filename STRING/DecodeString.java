package leet_code.STRING;
import java.util.Scanner;
import java.util.Stack;

public class DecodeString {

  // Method to decode the string
  public String decodeString(String s) {

    Stack<Integer> numStack = new Stack<>();
    Stack<String> stringStack = new Stack<>();
    int k = 0;

    for (char c : s.toCharArray()) {

      if (Character.isDigit(c)) {
        k = (k * 10) + (c - '0');
        continue;
      }

      if (c == '[') {
        numStack.push(k); // store the number before the '['
        k = 0;            // reset the current number for next potential digit
        stringStack.push("["); // push the opening bracket to mark the beginning of the substring
        continue;
      }

      if (c != ']') {
        stringStack.push(String.valueOf(c)); // push characters to the stack until ']'
        continue;
      }

      // When ']' is encountered, start forming the substring
      StringBuilder temp = new StringBuilder();
      while (!stringStack.peek().equals("[")) { // gather the substring inside the brackets
        temp.insert(0, stringStack.pop());
      }

      stringStack.pop(); // remove the '['

      // Now get the multiplier for the substring
      int count = numStack.pop();
      StringBuilder decodedString = new StringBuilder();
      for (int i = 0; i < count; i++) {
        decodedString.append(temp); // repeat the substring 'count' times
      }

      // Add the decoded substring to the stack
      stringStack.push(decodedString.toString());
    }

    // Form the final decoded string
    StringBuilder result = new StringBuilder();
    while (!stringStack.isEmpty()) {
      result.insert(0, stringStack.pop());
    }

    return result.toString();
  }

  // Main method to run the program
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter an encoded string:");
    String input = scanner.nextLine();

    DecodeString decodeString = new DecodeString();
    String result = decodeString.decodeString(input);

    System.out.println("Decoded string: " + result);

    scanner.close();
  }
}
