package Programs;

public class moveAllZerosToEnd_Optimal {
    public static void main(String[] args) {

//        int[] arr = {0,1, 0,3,12};
        int[] arr = {1,2,0,4,3,0,5,0};
        int len = arr.length;

        moveZerosToCorner(arr, len);
    }

    private static void moveZerosToCorner(int[] arr, int len) {

        int j=0;
        for (int i = 0; i < len; i++) {
            if (arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }

        for(int num : arr){
            System.out.print(num+" ");
        }
    }

}
