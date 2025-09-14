package BinarySearch;

public class SearchInsertPositionBrute {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,9,10};
        int x = 60;

        int res = findInsertPosition(arr, x);
        if (res != -1){
            System.out.println(x+" goes at the index "+res);
        }
    }

    static int findInsertPosition(int[] arr, int k){
        for(int i=0; i<arr.length; i++){
            if (arr[i] >= k){
                return i;
            }
        }
        return arr.length;
    }
}
