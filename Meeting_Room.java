// given a array of meeting time intervals consisting of start and end times 
// [[s1,e1],[s2,e2]] determine if a person could attend all meetings


package leet_code;
import java.util.Arrays;
import java.util.Comparator;

public class Meeting_Room{

    // Inner class to represent an interval
    static class Interval {
        int start;
        int end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public boolean canAttendMeetings(Interval[] intervals) {
    //Comparator<Interval> is a way to compare two Interval objects, which determines their order when sorting.
        Arrays.sort(intervals, new Comparator<Interval>() {   
            public int compare(Interval a, Interval b) {
                return a.start - b.start;
            }
        });

        for (int i = 1; i < intervals.length; i++) {
            Interval i1 = intervals[i - 1];
            Interval i2 = intervals[i];
            if (i2.start < i1.end) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Meeting_Room roomobj = new Meeting_Room();

        // Test case 1
        Interval[] intervals1 = {new Interval(0, 30), new Interval(5, 10), new Interval(15, 20)};
        System.out.println("Can attend all meetings: " + roomobj.canAttendMeetings(intervals1));  // Output: false

        // Test case 2
        Interval[] intervals2 = {new Interval(7, 10), new Interval(2, 4)};
        System.out.println("Can attend all meetings: " + roomobj.canAttendMeetings(intervals2));  // Output: true
    }
}
