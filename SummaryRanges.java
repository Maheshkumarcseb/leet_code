package leet_code;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int i = 0;

        while (i < nums.length) {
            int start = nums[i];

            while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                i++;
            }

            if (start != nums[i]) {
                ans.add(start + "->" + nums[i]);
            } else {
                ans.add(String.valueOf(nums[i]));
            }

            i++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 7}; // Example input array
        SummaryRanges summaryRanges = new SummaryRanges();
        List<String> result = summaryRanges.summaryRanges(nums);
        System.out.println(result); // Output: [0->2, 4->5, 7]
    }
}