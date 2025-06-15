package Programs;

public class MatrixMiddleElement {
    public static void main(String[] args) {
//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
    int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        int res = findMid(arr);
        System.out.println(res);
    }

    public static int findMid(int[][] arr){
        int col = arr.length;
        int row = arr[0].length;

        if (row % 2 != 0 && col % 2 != 0){
            return arr[row/2][col/2];
        }
        return -1;
    }
}

