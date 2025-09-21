package BinarySearch;

public class searchInRotatedArray2 {
    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,3,3,4,5,5,6};
        int k = 3;
        System.out.println(findElement(arr, k));
    }

    public static boolean findElement(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == k)
                return true;

//           if
//           3,1,2,3,3,3,3
//           s     m     e  all are 3
//           for this condition we can't make any comparison for find the sorted part
//           3,1,2,3,3,3,3
//             s   m   e
            if (arr[start] == arr[mid] && arr[mid] == arr[end]){
                start = start + 1;
                end = end - 1;
                continue;
            }

            if (arr[start] <= arr[mid]){
                if (arr[start] <= k && k <= arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] <=k && k<= arr[end]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}
