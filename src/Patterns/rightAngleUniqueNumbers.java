package Patterns;

public class rightAngleUniqueNumbers {
    public static void main(String[] args) {
        int n = 5;
        printfPattern(n);
    }
    public static void printfPattern(int n){

        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}

// output
//  1
//  2 3
//  4 5 6
//  7 8 9 10
