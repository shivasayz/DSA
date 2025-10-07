package BinarySearch;

public class findSquareRootBrute {
    public static void main(String[] args) {
        int n = 28;
        System.out.println(findSqrt(n));
    }

    public static int findSqrt(int n) {
        int ans = -1;

        for (int i=0; i<=n; i++){
            if ((i*i) <= n){
                ans = i;
            } else {
                break;
            }
        }
        return ans;
    }
}
