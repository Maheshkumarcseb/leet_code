package leet_code;

// Question-->https://leetcode.com/problems/equal-row-and-column-pairs/?envType=study-plan-v2&envId=leetcode-75
import java.util.Arrays;
import java.util.HashMap;

public class Equal_Rows_Columns_Pairs {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        // Convert each row to a string and count its occurrences
        for (int[] row : grid) {
            String rowStr = Arrays.toString(row);
            hashMap.put(rowStr, hashMap.getOrDefault(rowStr, 0) + 1);
        }

        int count = 0;
        
        // Check how many columns match the rows
        for (int j = 0; j < n; j++) {
            int[] col = new int[n];
            for (int i = 0; i < n; i++) {
                col[i] = grid[i][j];
            }
            count += hashMap.getOrDefault(Arrays.toString(col), 0);
        }
        
        return count;
    }

    public static void main(String[] args) {
        Equal_Rows_Columns_Pairs obj = new Equal_Rows_Columns_Pairs();

        // Example 1
        int[][] grid1 = {
            {1, 2, 3},
            {4, 2, 1},
            {7, 8, 9}
        };
        System.out.println("Example 1 Result: " + obj.equalPairs(grid1)); // Output will depend on grid configuration

        // Example 2
        int[][] grid2 = {
            {1, 2},
            {2, 1}
        };
        System.out.println("Example 2 Result: " + obj.equalPairs(grid2)); // Output will depend on grid configuration

        // Example 3
        int[][] grid3 = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };
        System.out.println("Example 3 Result: " + obj.equalPairs(grid3)); // Output will depend on grid configuration
    }
}
