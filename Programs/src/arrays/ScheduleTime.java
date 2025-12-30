package arrays;

/*
    Let arr = [[1,3],[2,6],[7,9][8,10],[15,20]]
    Every nested array has a time of meeting like 1pm to 3pm.
    If you see the second sibling, it has 2pm to 6pm.
    You already had a first meeting from 1 to 3 but second meeting is starting from 2 to 6.
    In this case you have to return [[1,6],[7,10],[15,20]]
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ScheduleTime {

    private static int[][] mergeIntervals(int[][] intervals) {

        if (intervals.length < 2) return intervals;

        Arrays.sort(intervals, Comparator.comparing(a -> a[0]));

        List<int[]> answer = new ArrayList<>();
        int[] newInterval = intervals[0]; //[1,3]
        answer.add(newInterval);

        for(int index = 1; index < intervals.length; index++) {
            int[] interval = intervals[index]; // [2,6]
            if(interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                newInterval = interval;
                answer.add(newInterval);
            }
        }
        return answer.toArray(new int[answer.size()][]);
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 20}
        };

        int[][] answer = mergeIntervals(arr);
        System.out.println(Arrays.deepToString(answer));

    }
}
