package BinarySearch;

public class findNthRootBrute {
    public static void main(String[] args) {
        int n = 3;
        int m = 27;

        System.out.println(findNthRoot(n, m));
    }

    public static int findNthRoot(int n, int m) {
        for (int i=1; i<=m; i++){
            if (fun(i, n) == m){
                return i;
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
