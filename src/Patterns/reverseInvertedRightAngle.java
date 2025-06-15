package Patterns;

public class reverseInvertedRightAngle {
    public static void main(String[] args) {
        int n = 5;
        printReverseInvertedRightAngle(n);
    }
    public static void printReverseInvertedRightAngle(int rows){

        for (int i = 0; i < rows; i++) {

            for (int k = 0; k < 2 * i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < rows - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// output

//  * * * * *
//  * * * *
//  * * *
//  * *
//  *
