package Patterns;

public class fullPyramid {
    public static void main(String[] args) {
        int n = 5;
        printFullPyramid(n);
    }
    public static boolean printFullPyramid(int rows){

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < 2 * (rows - i) - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(k+1+" ");
            }
            System.out.println();
        }
        return false;
    }
}


// output
//         1
//       1 2 3
//     1 2 3 4 5
//   1 2 3 4 5 6 7
// 1 2 3 4 5 6 7 8 9