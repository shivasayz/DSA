package Programs;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
         int k = 3;
        System.out.println(SlidingWindowSolve(arr, k));
    }

    public static int SlidingWindowSolve(int[] arr, int k){

        int n = arr.length;
        int maxValue = 0;
        int currWinSize = 0;

        if (n < k){
            return 0;
        }

        for (int i = 0; i < k; i++) {
            currWinSize += arr[i];
        }

        for (int i = k; i <n; i++) {
            currWinSize += arr[i] - arr[i-k];
            maxValue = Math.max(maxValue, currWinSize);
        }
        return maxValue;
    }
}
