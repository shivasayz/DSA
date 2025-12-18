package Programs;

public class LongestConsecutiveSeqOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,2,3,1,1,1,1,1,1,1,0,1,1};
        System.out.println(Brute(arr));
        System.out.println(Optimal(arr));
    }

    public static int Brute(int[] arr){
        int count;
        int maxOnes = 0;

        for (int i=0; i<arr.length; i++){
            count = 0;
            for (int j=i; j<arr.length; j++){
                if (arr[j] == 1) {
                    count++;
                    maxOnes = Math.max(maxOnes, count);
                } else {
                    break;
                }
            }
        }
        return maxOnes;
    }

    public static int Optimal(int[] arr){
        int count = 0;
        int maxSeq = 0;

        for (int ele : arr) {
            if (ele == 1) {
                count++;
                maxSeq = Math.max(maxSeq, count);
            } else {
                count = 0;
            }
        }
        return maxSeq;
    }
}
