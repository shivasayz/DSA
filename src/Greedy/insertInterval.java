package Greedy;

import java.util.ArrayList;
import java.util.List;

public class insertInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,2}, {3,5}, {6,7}, {8,10}, {12,16}};
        int[] newInterval = {4,8};
        int[][] res = insert(intervals, newInterval);
        System.out.print("[");
        for(int[] m: res){
            System.out.print("["+m[0]+","+m[1]+"]");
        }
        System.out.print("]");
    }

    public static int[][] insert(int[][] interval, int[] newInterval){
        List<int[]> res = new ArrayList<>();
        int i = 0, n = interval.length;

        while(i < n && interval[i][1] < newInterval[0]){
            res.add(interval[i]);
            i++;
        }

        int minStart = newInterval[0];
        int maxEnd = newInterval[1];

        while(i < n && interval[i][0] <= newInterval[1]){
            minStart = Math.min(minStart, interval[i][0]);
            maxEnd = Math.max(maxEnd, interval[i][1]);
            i++;
        }
        res.add(new int[]{
                minStart,
                maxEnd
        });

        while(i < n){
            res.add(interval[i]);
            i++;
        }

        int[][] output = new int[res.size()][2];
        for(int k=0; k<res.size(); k++){
            output[k] = res.get(k);
        }

        return output;
    }
}
