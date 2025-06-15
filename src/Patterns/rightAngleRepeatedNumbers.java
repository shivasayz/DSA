package Patterns;

public class rightAngleRepeatedNumbers {
    public static void main(String[] args) {
        int n = 6;
        print(n);
    }
    public static void print(int n){

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

// output
//  1
//  2 2
//  3 3 3
//  4 4 4 4
//  5 5 5 5 5
//  6 6 6 6 6 6
