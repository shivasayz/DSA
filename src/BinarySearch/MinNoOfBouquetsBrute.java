package BinarySearch;

public class MinNoOfBouquetsBrute {
    public static void main(String[] args) {
        int[] bloomDay = {7,7,7,7,13,11,12,7};
        int m = 2; // num of bouquets
        int n = 3; // Adj flowers required

        System.out.println(findMin(bloomDay, m, n));
    }

    public static int findMin(int[] arr, int m, int n){
        int[] res = findMinAndMax(arr);

        if (arr.length < (m*n)) return -1;

        for (int i=res[0]; i<=res[1]; i++) {
            if (isPossible(arr, i, m, n)) return i;
        }
        return -1;
    }

    public static boolean isPossible(int[] arr, int day, int m, int n){
        int count = 0, noOfBouquets = 0;

        for (int ele : arr) {
            if (ele <= day) {
                count++;
                if (count == n) {
                    noOfBouquets++;
                    count = 0;
                }
            } else {
                count = 0;
            }

        }
        noOfBouquets += (count / m);
        return noOfBouquets >= m;
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

// TC -> O ((max - min + 1) x N)