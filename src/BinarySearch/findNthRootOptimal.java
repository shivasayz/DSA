package BinarySearch;

public class findNthRootOptimal {
    public static void main(String[] args) {
        int n = 3;
        int m = 27;

        System.out.println(findNthRoot(n, m));
    }

    public static int findNthRoot(int n, int m) {
        int start = 1;
        int end = m;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int res = fun(n, mid);

            if (res == m) {
                return mid;
            } else if (res > mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int fun(int val, int n) {
        int res = 1;
        for(int i=1; i<=n; i++) {
            res *= val;
        }
        return res;
    }
}
