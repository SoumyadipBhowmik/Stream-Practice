package done.medium;

//Merge overlapping intervals.
//Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//Output: [[1,6],[8,10],[15,18]]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] input = {
                {1, 3},
                {2, 3},
                {8, 10},
                {15, 18}
        };

        System.out.println(Arrays.deepToString(mergeIntervals(input)));
    }

    private static int[][] mergeIntervals(int[][] intervals) {

        if(intervals.length < 2) return intervals;
        Arrays.sort(intervals, Comparator.comparing(interval -> interval[0]));

        List<int[]> answer = new ArrayList<>();
        int[] currentInterval = intervals[0];
        answer.add(currentInterval);

        for(int index = 1; index < intervals.length; index++) {
            int[] interval = intervals[index];
            if(interval[0] <= currentInterval[1]) {
                currentInterval[1] = Math.max(currentInterval[1], interval[1]);
            } else {
                currentInterval = interval;
                answer.add(currentInterval);
            }
        }
        return answer.toArray(new int[answer.size()][]);
    }
}
