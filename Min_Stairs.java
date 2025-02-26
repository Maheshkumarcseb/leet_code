package leet_code;
import java.util.Scanner;
class Min_Stairs {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] minCost = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            minCost[i] = Math.min((cost[i - 1] + minCost[i - 1]), (cost[i - 2] + minCost[i - 2]));
        }
        return minCost[n];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of steps: ");
        int n = scanner.nextInt();
        int[] cost = new int[n];

        System.out.println("Enter the ccost for each step: ");
        for (int i = 0; i < n; i++) {
            cost[i] = scanner.nextInt();
        }

        Min_Stairs Min_Stairsobj = new Min_Stairs();
        int result = Min_Stairsobj.minCostClimbingStairs(cost);
        System.out.println("Minimum cost to reach the top: " + result);
        scanner.close();
    }
}
