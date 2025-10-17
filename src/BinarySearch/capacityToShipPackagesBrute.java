package BinarySearch;

public class capacityToShipPackagesBrute {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int d = 1;

        System.out.println(findLestCapacity(weights,d));
    }

    public static int findLestCapacity(int[] weights, int day) {
        int low = findMax(weights);
        int high = sumOf(weights);

        for (int i=low; i<=high; i++) {
            if (isPossible(weights, i, day)) return i;
        }
        return -1;
    }

    public static boolean isPossible(int[] weights, int currWeight, int day) {
        int load = 0;
        int d = 1;

        for (int i=0; i<weights.length; i++){
            if (weights[i] + load > currWeight){
                d++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return d <= day;
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for(int ele: arr) {
            if (ele > max) max = ele;
        }
        return max;
    }

    public static int sumOf(int[] arr) {
        int sum = 1;
        for (int ele : arr) {
            sum += ele;
        }
        return sum;
    }
}
