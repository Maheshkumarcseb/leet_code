package leet_code;
import java.util.Scanner;
class Maximum_Loot {
    public int rob(int[] nums) {
        if (nums.length < 2)
            return nums[0];
        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of houses: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the amount of money in each house: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Maximum_Loot Maximum_Lootobj = new Maximum_Loot();
        int maxMoney = Maximum_Lootobj.rob(nums);
        System.out.println("Maximum money that can be robbed: " + maxMoney);
        scanner.close();
    }
}
