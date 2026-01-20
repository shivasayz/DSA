package Greedy;

public class jumpGame {
    public static void main(String[] args) {
        int[] jumps = {1, 2, 4, 1, 1, 0, 2, 5};
        System.out.println(isMaxJumpPossible(jumps));
    }

    public static boolean isMaxJumpPossible(int[] jumps){
        int maxLen = 0;
        for(int i=0; i<jumps.length; i++){
            if (i > maxLen) return false;
            maxLen = Math.max(maxLen, i + jumps[i]);
        }
        return true;
    }
}
