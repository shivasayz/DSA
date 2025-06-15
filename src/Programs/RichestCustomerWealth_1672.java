package Programs;

public class RichestCustomerWealth_1672 {
    public static void main(String[] args) {
        int[][] arr = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] arr){
        int Max=0;

        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            Max = Math.max(Max, sum);
        }
        return Max;
    }

}
