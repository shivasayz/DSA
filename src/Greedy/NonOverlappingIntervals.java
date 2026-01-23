package Greedy;

import java.util.Arrays;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,2}, {2,3}, {3,4}, {1,3}};
        System.out.println(findNonOverlapping(intervals));
    }

    public static int findNonOverlapping(int[][] intervals){
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = 0;
        int lastInterval = intervals[0][1];

        for (int i=1; i<intervals.length; i++) {
            if (intervals[i][0] < lastInterval) {
                count++;
            } else {
                lastInterval = intervals[i][1];
            }
        }
        return count;
    }
}
