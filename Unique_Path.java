package leet_code;
import java.util.Scanner;

class Unique_Path {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0)
                    grid[i][j] = 1;
                else
                    grid[i][j] = grid[i][j - 1] + grid[i - 1][j];
            }
        }
        return grid[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = scanner.nextInt();
        Unique_Path Unique_PathObj = new Unique_Path();
        int result = Unique_PathObj.uniquePaths(m, n);
        System.out.println("Number of unique paths: " + result);
        
        scanner.close();
    }
}
