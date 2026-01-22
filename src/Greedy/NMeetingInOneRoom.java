package Greedy;

import java.util.ArrayList;
import java.util.List;

public class NMeetingInOneRoom {

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        List<Integer> result = maxMeeting(start, end);
        System.out.println(result);
    }

    public static List<Integer> maxMeeting(int[] start, int[] end) {
        List<int[]> meeting = new ArrayList<>();

        // Store as {end, start, index}
        for (int i = 0; i < start.length; i++) {
            meeting.add(new int[]{end[i], start[i], i + 1});
        }

        // Sort by end time (ascending)
        meeting.sort((e1, e2) -> e1[0] - e2[0]);

        List<Integer> result = new ArrayList<>();
        int lastEnd = -1;

        // Greedy selection
        for (int[] m : meeting) {
            if (m[1] > lastEnd) {
                result.add(m[2]);
                lastEnd = m[0];
            }
        }

        return result;
    }
}
