package Programs;

public class squareRoot {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(isSquareRoot(n));
    }
    static int isSquareRoot(int n){

        int start = 1;
        int end = n;

        if (start > end){
            return -1;
        }

            int mid = start + (end - start) / 2;
            int square = mid * mid;

            if (square == mid){
                return (int)mid;
            } else if (square < n){
                start = mid + 1;
            } else {
                end = mid;
            }

        return (int) (start-1);
    }
}
