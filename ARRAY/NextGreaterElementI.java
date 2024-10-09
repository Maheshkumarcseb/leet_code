package leet_code.ARRAY;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        if (nums2.length == 0 || nums1.length == 0) {
            return new int[0]; // Handle empty cases
        }

        Map<Integer, Integer> numberNGE = new HashMap<>();
        Stack<Integer> numStack = new Stack<>();

        // Process nums2 from right to left, storing next greater elements in the map
        numStack.push(nums2[nums2.length - 1]);
        numberNGE.put(nums2[nums2.length - 1], -1);

        for (int i = nums2.length - 2; i >= 0; i--) {
            if (nums2[i] < numStack.peek()) {
                numberNGE.put(nums2[i], numStack.peek());
                numStack.push(nums2[i]);
                continue;
            }

            while (!numStack.isEmpty() && numStack.peek() < nums2[i]) {
                numStack.pop();
            }

            if (numStack.isEmpty()) {
                numStack.push(nums2[i]);
                numberNGE.put(nums2[i], -1);
            } else {
                numberNGE.put(nums2[i], numStack.peek());
                numStack.push(nums2[i]);
            }
        }

        // Replace elements in nums1 with their next greater elements from nums2
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = numberNGE.get(nums1[i]);
        }

        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        NextGreaterElementI solution = new NextGreaterElementI();
        int[] result = solution.nextGreaterElement(nums1, nums2);

        System.out.println("nums1: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Next greater elements for nums1: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}