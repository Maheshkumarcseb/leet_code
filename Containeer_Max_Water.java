//Question--->https://leetcode.com/problems/container-with-most-water/submissions/1319277380/?envType=study-plan-v2&envId=leetcode-75

package leet_code;
public class Containeer_Max_Water {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(area, maxArea);

            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Containeer_Max_Water obj = new Containeer_Max_Water();

        // Test case 1
        int[] heights1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max area: " + obj.maxArea(heights1)); // Output: 49

        // Test case 2
        int[] heights2 = {1, 1};
        System.out.println("Max area: " + obj.maxArea(heights2)); // Output: 1

        // Test case 3
        int[] heights3 = {4, 3, 2, 1, 4};
        System.out.println("Max area: " + obj.maxArea(heights3)); // Output: 16

        // Test case 4
        int[] heights4 = {1, 2, 1};
        System.out.println("Max area: " + obj.maxArea(heights4)); // Output: 2
    }
}

// Time Complexity--> O(n)
//Space Complexity--> O(1)


