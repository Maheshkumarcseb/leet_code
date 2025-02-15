package leet_code;

import java.util.Arrays;

public class Count_Bits {

    public int[] countBits(int n) {
        int[] ans = new int[n + 1]; // 1D array to store results
        
        for (int i = 0; i <= n; i++) {
            int temp = i;
            int count = 0;
            while (temp != 0) {
                count += temp % 2; // Count set bits (1s)
                temp /= 2; // Reduce number
            }
            ans[i] = count; // Store the count in the result array
        }
        
        return ans; // Return the computed array
    }

    public static void main(String[] args) {
        Count_Bits solution = new Count_Bits(); // Create an instance of the class
        
        int n = 5; // Example input
        int[] result = solution.countBits(n); // Call the method

        System.out.println("Count of set bits from 0 to " + n + ": " + Arrays.toString(result));
    }
}
