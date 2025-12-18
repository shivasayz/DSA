package Programs;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        System.out.println(Brute(arr));
        System.out.println(Optimal(arr));
    }

    public static int Brute(int[] arr){
        int count=1;

        for (int j : arr) {
            int x = j;
            count = 1;

            while (linearSearch(arr, x + 1)) {
                x += 1;
                count++;
            }
        }
        return count;
    }

    private static boolean linearSearch(int[] arr, int i) {
        for(int ele: arr){
            if (ele == i) return true;
        }
        return false;
    }

    public static int Optimal(int[] arr){
        Set<Integer> set = new HashSet<>();;
        int longest = 0;

        for(int ele: arr){
            set.add(ele);
        }

        for(int ele: arr){
            if (!set.contains(ele-1)){
                int count = 1;
                int x = ele;

                while (set.contains(x+1)){
                    count++; x++;
                }

                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
