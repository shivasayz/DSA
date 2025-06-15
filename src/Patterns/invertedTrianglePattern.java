package Patterns;

public class invertedTrianglePattern {
    public static void main(String[] args) {
        int n = 6;
        printInvertedTriangle(n);
    }
    
    public static void printInvertedTriangle(int n){

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < n-i; k++) {
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
}

// output
//    111111
//     22222
//      3333
//       444
//        55
//         6


// output
//  1 1 1 1 1 1
//   2 2 2 2 2
//    3 3 3 3
//     4 4 4
//      5 5
//       6
