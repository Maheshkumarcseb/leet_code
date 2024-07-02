//Question--->https://leetcode.com/problems/merge-sorted-array/submissions/1307241672/?envType=study-plan-v2&envId=top-interview-150

package leet_code;

class Merge_sorted_array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Merge_sorted_array solution = new Merge_sorted_array();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Additional test case
        nums1 = new int[]{4, 5, 6, 0, 0, 0};
        nums2 = new int[]{1, 2, 3};
        m = 3;
        n = 3;

        solution.merge(nums1, m, nums2, n);

        System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
