package BinarySearch;

public class MinNoOfBouquetsOptimal {
    public static void main(String[] args) {
        int[] bloomDay = {7,7,7,7,13,11,12,7};
        int m = 2; // num of bouquets
        int n = 3; // Adj flowers required

        System.out.println(findMin(bloomDay, m, n));
    }

    public static int findMin(int[] arr, int m, int n){
        int[] res = findMinAndMax(arr);

        if (arr.length < (m*n)) return -1;

        int start = res[0];
        int end = res[1];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int ans = isPossible(arr, mid, m, n);

            if (ans >= m){
                end = mid - 1;
            } else  {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int isPossible(int[] arr, int day, int m, int n){
        int count = 0, noOfBouquets = 0;

        for (int ele : arr) {
            if (ele <= day) {
                count++;
            } else {
                noOfBouquets += (count / n);
                count = 0;
            }
        }
        noOfBouquets += (count / m);
        return noOfBouquets;
    }

    public static int[] findMinAndMax(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int ele: arr){
            min = Math.min(min, ele);
            max = Math.max(max, ele);
        }
        return new int[] {min, max};
    }
}

// TC -> O(N x log (max - min + 1))