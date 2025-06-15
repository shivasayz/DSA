package Programs;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int d = 10;

        ArrayRotate(arr, d);
    }

    private static void ArrayRotate(int[] arr, int d) {

        int[] res = new int[arr.length];
        d %= arr.length;

        for (int i = 0; i < arr.length - d; i++) {
            res[i] = arr[d+i];
        }

        for (int j = 0; j < d; j++) {
            res[arr.length - d + j] = arr[j];
        }

        for (int k = 0; k < arr.length; k++) {
            arr[k] = res[k];
        }

        for (int num: res){
            System.out.print(num+" ");
        }

    }
}
