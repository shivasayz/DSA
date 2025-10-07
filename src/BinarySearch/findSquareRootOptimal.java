package BinarySearch;

public class findSquareRootOptimal {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(findSqrt(n));
    }

    public static int findSqrt(int n) {
        if (n == 0 || n == 1) return n;

        int start = 1;
        int end = n;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long ele = (long) mid * mid;

            if (ele <= n){
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
