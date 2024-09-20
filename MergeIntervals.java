package leet_code;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class MergeIntervals {

  int[][] merge(int[][] intervals) {

    if (intervals.length <= 1)
      return intervals;

    // Sort by ascending starting point
    Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

    List<int[]> result = new ArrayList<>();

    int[] newInterval = intervals[0];
    result.add(newInterval);

    for (int[] interval : intervals) {
      if (interval[0] <= newInterval[1])
        // Overlapping intervals,
        // update the end if needed
        newInterval[1] = Math.max(newInterval[1], interval[1]);
      else {
        // Disjoint intervals,
        // add the new interval to the list
        newInterval = interval;
        result.add(newInterval);
      }
    }

    return result.toArray(new int[result.size()][]);
  }

  public static void main(String[] args) {
    MergeIntervals mergeIntervals = new MergeIntervals();

    // Example intervals
    int[][] intervals = {
      {1, 3},
      {2, 6},
      {8, 10},
      {15, 18}
    };

    // Merging intervals
    int[][] mergedIntervals = mergeIntervals.merge(intervals);

    // Printing the result
    System.out.println("Merged intervals:");
    for (int[] interval : mergedIntervals) {
      System.out.println(Arrays.toString(interval));
    }
  }
}
