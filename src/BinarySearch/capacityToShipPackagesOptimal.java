package BinarySearch;

public class capacityToShipPackagesOptimal {
    public static void main(String[] args) {
        int[] weights = {5,4,5,2,3,4,5,6};
        int d = 5;

        System.out.println(findCapacity(weights, d));
    }

    public static int findCapacity(int[] arr, int d){
        int low = findMax(arr);
        int high = findSum(arr);

        for(int i=low; i<high; i++){
            int days = findReqDays(arr, i);
            if (days <= d){
                return i;
            }
        }
        return -1;
    }

    public static int findReqDays(int[] arr, int currDay) {
        int days = 1, load = 0;

        for(int currWeight: arr) {
            if (currWeight + load > currDay){
                days++;
                load = currWeight;
            } else {
                load += currWeight;
            }
        }
        return days;
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for(int ele: arr){
            if (ele > max) max = ele;
        }
        return max;
    }

    public static int findSum(int[] arr) {
        int sum = 1;
        for(int ele: arr) {
            sum += ele;
        }
        return sum;
    }
}
