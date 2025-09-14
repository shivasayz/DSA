package BinarySearch;

public class UpperBondIteration {
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        int k = 4;
        System.out.println(findUpperBond(arr, k));
    }

    public static int findUpperBond(int[] arr, int k){

        if (arr.length < 2){
            return -1;
        }

        for(int ele: arr){
            if (ele > k){
                return ele;
            }
        }

        return -1;
    }
}
