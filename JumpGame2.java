// https://leetcode.com/problems/jump-game-ii/?envType=study-plan-v2&envId=top-interview-150

// Input: nums = [2,3,1,1,4]
// Output: 2

// Input: nums = [2,3,0,1,4]
// Output: 2


package leet_code;
class JumpGame2 {
    public int jump(int[] nums) {
        int totalJumps = 0;
        int destination = nums.length - 1;
        int coverage = 0, lastJumpIdx = 0;

        // Base case
        if (nums.length == 1) return 0;

        // Greedy strategy: extend coverage as long as possible
        for (int i = 0; i < nums.length; i++) {
            coverage = Math.max(coverage, i + nums[i]);

            if (i == lastJumpIdx) {
                lastJumpIdx = coverage;
                totalJumps++;

                // check if we reached destination already
                if (coverage >= destination) {
                    return totalJumps;
                }
            }
        }

        return totalJumps;
    }

    public static void main(String[] args) {
        JumpGame2 jumpobj = new JumpGame2();

        int[] test1 = {2, 3, 1, 1, 4};
        int[] test2 = {2, 3, 0, 1, 4};
        int[] test3 = {1, 2, 3, 4, 5};
        int[] test4 = {3, 2, 1, 0, 4};

        System.out.println("Test 1: Minimum jumps = " + jumpobj.jump(test1)); // Output: 2
        System.out.println("Test 2: Minimum jumps = " + jumpobj.jump(test2)); // Output: 2
        System.out.println("Test 3: Minimum jumps = " + jumpobj.jump(test3)); // Output: 3
        System.out.println("Test 4: Minimum jumps = " + jumpobj.jump(test4)); // Output: -1 (Unreachable, depends on the problem definition)
    }
}
