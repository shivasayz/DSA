package Programs;

public class moveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,0,4,3,0,5,0};
        int len = arr.length;

        moveZeros(arr, len);
    }

    private static void moveZeros(int[] arr, int len) {
        int[] res = new int[len];
        int idx = 0;

        for (int i = 0; i < len; i++) {
            if(arr[i] != 0){
                res[idx++] = arr[i];
            }
        }

        for (int i = idx; i < len; i++) {
            res[idx++] = 0;
        }

        for (int i = 0; i < len; i++) {
            arr[i] = res[i];
        }

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
