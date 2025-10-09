package BinarySearch;

public class findPeakElementBrute {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,5,1};
        System.out.println(findPeak(arr));
    }

    public static int findPeak(int[] arr) {
        int n = arr.length-1;

        if (n == 1) return arr[0];

        for (int i=1; i<n-1; i++){

            if (arr[0] > arr[1]){
                return arr[0];
            }

            if (arr[n] > arr[n-1]){
                return arr[n];
            }

            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
}


