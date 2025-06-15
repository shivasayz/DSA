package Patterns;

public class rightAngleTriangle {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
    public static void print(int n){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// output
//  *
//  * *
//  * * *
//  * * * *
