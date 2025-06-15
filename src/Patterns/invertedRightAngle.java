package Patterns;

public class invertedRightAngle {
    public static void main(String[] args) {
        int n = 5;
        printInvertedRightAngle(n);
    }
    public static void printInvertedRightAngle(int rows){

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//        * * * * *
//        * * * *
//        * * *
//        * *
//        *