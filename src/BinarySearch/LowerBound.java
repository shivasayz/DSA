package BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        int x = 2;
        int n = arr.length;

        int res = findLowerBound(arr, n, x);
        if (res != n) {
            System.out.println("lower bond of "+x+" is "+res);
        } else {
            System.out.println("lower bond not found....");
        }
    }

    public static int findLowerBound(int[] arr, int n, int k) {
        int ans = n;
        int start = 0;
        int end = n - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] >= k){
                ans = arr[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
