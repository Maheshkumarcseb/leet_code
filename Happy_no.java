package leet_code;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Happy_no {
    
    // Method to check if a number is a happy number
    public static boolean isHappy(int n) {
        Set<Integer> usedIntegers = new HashSet<>();
        while (true) {
            // Find the sum of squares
            int sum = 0;
            while (n != 0) {
                sum += Math.pow(n % 10, 2.0);
                n = n / 10;
            }

            // If sum is 1, return true
            if (sum == 1) return true;

            // Else, the new number is the current sum
            n = sum;

            // Check if we have already encountered that number
            if (usedIntegers.contains(n)) return false;
            usedIntegers.add(n);
        }
    }

    // Main method to test the isHappy function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is happy: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isHappy(number)) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is not a happy number.");
        }
    }
}
