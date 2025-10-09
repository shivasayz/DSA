package BinarySearch;

// if arr[i] > than it's right element, it falls in the decreasing curve (e.g. 6 > 7 -> decreasing curve)
// e.g. [1, 10, 13, 7, 6, 5, 4, 2, 1, 0]
// e.g. [1, 5, 1, 2, 1]

public class findPeakElementOptimal {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,5,1};
        int[] arr = {1,5,1,2,1};
        System.out.println(findPeak(arr));
    }

    public static int findPeak(int[] arr) {
        int n = arr.length-1;
        int start = 1;
        int end = arr.length-2;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[0] > arr[1]) return arr[0];
            if (arr[n] > arr[n-2]) return arr[n];

            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid + 1]){
                return arr[mid];
            } else if (arr[mid] > arr[mid - 1]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

