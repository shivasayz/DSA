package BinarySearch;

public class SingleElementInSortedArrBrute {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,5,6,6,7,8,8,9,9};
        System.out.println(findSingleElement(arr));
    }

    public static int findSingleElement(int[] arr) {
        int n = arr.length-1;
        for (int i=0; i<arr.length-1; i++) {

            if (i == 0){
                if (arr[i] != arr[i+1]){
                    return arr[i];
                }
            } else if (i == n){
                if (arr[i] != arr[i-1]){
                    return arr[i];
                }
            } else {
                if (arr[i] != arr[i-1] && arr[i] != arr[i+1]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
