package Programs;

public class RotateOfArray_Optimal {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int swap = 10;

        int d = swap % arr.length;

        RotateAnArray(arr, 0, d-1);
        RotateAnArray(arr, d, arr.length-1);
        RotateAnArray(arr, 0, arr.length - 1);

        printArray(arr);
    }

    private static void RotateAnArray(int[] arr, int start, int end) {

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    private static void printArray(int[] arr){
        for(int num: arr){
            System.out.print(num+" ");
        }
    }


}
