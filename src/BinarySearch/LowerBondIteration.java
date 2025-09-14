package BinarySearch;

public class LowerBondIteration {
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        int x = 12;

        System.out.println(findLowerBondBrute(arr, x));
    }

    public static int findLowerBondBrute(int[] arr, int k){
        for(int ele: arr){
            if (ele >= k){
                return ele;
            }
        }
        return -1;
    }
}
