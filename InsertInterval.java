package leet_code;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        boolean inserted = false;

        // Loop through all intervals
        for (int[] i : intervals) {
            // Insert newInterval if it fits before the current interval and hasn't been added yet
            if (i[0] > newInterval[0] && !inserted) {
                list.add(newInterval);
                inserted = true;
            }
            list.add(i);
        }

        // If newInterval has not been inserted, add it at the end
        if (!inserted) {
            list.add(newInterval);
        }

        // Solve to merge intervals
        return solve(list);
    }

    // Merging intervals
    public int[][] solve(List<int[]> intervals) {
        List<int[]> res = new ArrayList<>();
        int start = intervals.get(0)[0];
        int end = intervals.get(0)[1];

        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i)[0] <= end) {
                // Merge intervals if overlapping
                end = Math.max(intervals.get(i)[1], end);
            } else {
                // Add the merged interval to result
                res.add(new int[]{start, end});
                start = intervals.get(i)[0];
                end = intervals.get(i)[1];
            }
        }

        // Add the last interval
        res.add(new int[]{start, end});

        // Convert the result list to a 2D array
        int[][] ans = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            ans[i][0] = res.get(i)[0];
            ans[i][1] = res.get(i)[1];
        }

        return ans;
    }

    // Main function to test the solution
    public static void main(String[] args) {
        InsertInterval InsertIntervalobj = new InsertInterval();
        Scanner scanner = new Scanner(System.in);

        // Input the number of intervals
        System.out.println("Enter the number of intervals:");
        int n = scanner.nextInt();

        // Input intervals
        int[][] intervals = new int[n][2];
        System.out.println("Enter the intervals:");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = scanner.nextInt();
            intervals[i][1] = scanner.nextInt();
        }

        // Input new interval
        System.out.println("Enter the new interval:");
        int[] newInterval = new int[2];
        newInterval[0] = scanner.nextInt();
        newInterval[1] = scanner.nextInt();

        // Call the insert function
        int[][] result = InsertIntervalobj.insert(intervals, newInterval);

        // Output the result
        System.out.println("Merged intervals:");
        for (int[] interval : result) {
            System.out.println(interval[0] + " " + interval[1]);
        }

        scanner.close();
    }
}
