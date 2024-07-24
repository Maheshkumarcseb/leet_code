

// Question---->https://leetcode.com/problems/coin-change/submissions/1331862531/?envType=study-plan-v2&envId=top-interview-150
package leet_code;
public class CoinChange {

  int coinChange(int[] coins, int amount) {
    // Check edge case
    if (amount < 1) return 0;

    // Create DP array
    int[] minCoinsDP = new int[amount + 1];

    for (int i = 1; i <= amount; i++) {
      minCoinsDP[i] = Integer.MAX_VALUE;

      // Try each coin
      for (int coin : coins) {
        if (coin <= i && minCoinsDP[i - coin] != Integer.MAX_VALUE)
          minCoinsDP[i] = Math.min(minCoinsDP[i], 1 + minCoinsDP[i - coin]);
      }
    }

    return minCoinsDP[amount] == Integer.MAX_VALUE ? -1 : minCoinsDP[amount];
  }

  public static void main(String[] args) {
    CoinChange coinChange = new CoinChange();
    
    // Test case 1
    int[] coins1 = {1, 2, 5};
    int amount1 = 11;
    System.out.println("Minimum coins needed: " + coinChange.coinChange(coins1, amount1)); // Output: 3

    // Test case 2
    int[] coins2 = {2};
    int amount2 = 3;
    System.out.println("Minimum coins needed: " + coinChange.coinChange(coins2, amount2)); // Output: -1

    // Test case 3
    int[] coins3 = {1};
    int amount3 = 0;
    System.out.println("Minimum coins needed: " + coinChange.coinChange(coins3, amount3)); // Output: 0

    // Test case 4
    int[] coins4 = {1};
    int amount4 = 2;
    System.out.println("Minimum coins needed: " + coinChange.coinChange(coins4, amount4)); // Output: 2
  }
}
