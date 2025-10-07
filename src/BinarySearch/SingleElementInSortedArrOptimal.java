package BinarySearch;

public class SingleElementInSortedArrOptimal {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,5,6,6,7,8,8,9,9};
        System.out.println(findSingleElement(arr));
    }

    public static int findSingleElement(int[] arr) {
        int n = arr.length;
        int start = 1;
        int end = n-2;

        if (arr[0] != arr[start]){
            return arr[0];
        }

        if (arr[n-1] != arr[end]){
            return arr[end];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }

            if (mid % 2 == 1 && arr[mid] == arr[mid-1] || mid % 2 == 0 && arr[mid] == arr[mid+1]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
