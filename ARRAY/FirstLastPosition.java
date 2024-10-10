package leet_code.ARRAY;


import java.util.Arrays;

public class FirstLastPosition {

    public int[] searchRange(int[] nums, int target) {
        int left = findLeftBound(nums, target);
        int right = findRightBound(nums, target);
        return new int[]{left, right};
    }

    private int findLeftBound(int[] nums, int target) {
        int index = -1, low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                index = mid;
                high = mid - 1; // Look in the left sub-array
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return index;
    }

    private int findRightBound(int[] nums, int target) {
        int index = -1, low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                index = mid;
                low = mid + 1; // Look in the right sub-array
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        FirstLastPosition FirstLastPositionobj = new FirstLastPosition();
        int[] result = FirstLastPositionobj.searchRange(nums, target);

        System.out.println("First and last positions of " + target + ": " + Arrays.toString(result));
    }
}