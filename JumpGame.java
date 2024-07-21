// https://leetcode.com/problems/jump-game/submissions/1328077442/?envType=study-plan-v2&envId=top-interview-150

// Input: nums = [2,3,1,1,4]
// Output: true


// Input: nums = [3,2,1,0,4]
// Output: false



package leet_code;
public class JumpGame {

    boolean canJump(int[] nums) {
        // Initially the final position is the last index
        int finalPosition = nums.length - 1;

        // Start with the second last index
        for (int idx = nums.length - 2; idx >= 0; idx--) {
            // If you can reach the final position from this index
            // update the final position flag
            if (idx + nums[idx] >= finalPosition) {
                finalPosition = idx;
            }
        }

        // If we reach the first index, then we can
        // make the jump possible
        return finalPosition == 0;
    }

    public static void main(String[] args) {
        JumpGame game = new JumpGame();

        int[] test1 = {2, 3, 1, 1, 4};
        int[] test2 = {3, 2, 1, 0, 4};

        System.out.println("Test 1: " + (game.canJump(test1) ? "Can jump" : "Cannot jump")); // Output: Can jump
        System.out.println("Test 2: " + (game.canJump(test2) ? "Can jump" : "Cannot jump")); // Output: Cannot jump
    }
}
