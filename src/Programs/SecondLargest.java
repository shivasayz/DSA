package Programs;

public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {12,35,1,10,34,1};
        int len = arr.length;

        int res = findSecondLargest(arr, len);
        System.out.println("Second largest is "+res);
    }

    private static int findSecondLargest(int[] arr, int len) {

        int largest = arr[0];
        int smallest = -1;
        int res = -1;

        if(len < 2){
            return res;
        }

        for (int i = 1; i < len; i++) {

            if (arr[i] > largest) {
                smallest = largest;
                largest = arr[i];
            }

            if (arr[i] < largest && arr[i] > smallest) {
                smallest = arr[i];
            }
        }

        return smallest;
    }

}
