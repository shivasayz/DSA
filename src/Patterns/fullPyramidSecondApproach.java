package Patterns;

public class fullPyramidSecondApproach {
    public static void main(String[] args) {
        int n = 5;
        printFullPyramid(n);
    }
    public static void printFullPyramid(int rows){

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < rows-i-1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print(j+1);
            }

            for (int k = i; k >0 ; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}


// output
//      1
//     121
//    12321
//   1234321
//  123454321
