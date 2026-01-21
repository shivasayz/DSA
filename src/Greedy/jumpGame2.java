package Greedy;

public class jumpGame2 {
    public static void main(String[] args) {
        int[] jumps = {2, 3, 1, 4, 1, 1, 1, 2};
        System.out.println(findMinPossibleJumps(jumps));
    }

    public static int findMinPossibleJumps(int[] jumps) {
        int noOfJumps = 0;
        int l = 0, r = 0;

        while (r < jumps.length - 1) {
            int farthest = 0;

            for (int i = l; i <= r; i++) {
                farthest = Math.max(farthest, i + jumps[i]);
            }

            l = r + 1;
            r = farthest;
            noOfJumps++;
        }
        return noOfJumps;
    }

}
