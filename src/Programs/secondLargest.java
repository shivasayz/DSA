package Programs;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {100,82,52,62,41,12,35,95,78};
        System.out.println(findSecondLargest(arr));
    }

    public static int findSecondLargest(int[] arr){
        int largest = arr[0];
        int secondLar = -1;

        if (arr.length < 2){
            return -1;
        }

        for (int j : arr) {
            if (j > largest) {
                secondLar = largest;
                largest = j;
            }

            if (j < largest && j > secondLar) {
                secondLar = j;
            }
        }
        return secondLar;
    }
}
