package Programs;

public class DeletingFromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8};

        Print(arr);
        System.out.println();
        DeleteAt(arr, 3);
        Print(arr);
    }

    public static void DeleteAt(int[] arr, int idx){
        for (int i = idx; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
    }

    public static void Print(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
