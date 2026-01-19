package Greedy;

import java.util.Arrays;

public class assignCookie {
    public static void main(String[] args) {
        int[] g = {1, 5, 3, 3, 4};
        int[] s = {4, 2, 1, 2, 1, 3};

        System.out.println(findMaxCookieAssign(g, s));
    }

    public static int findMaxCookieAssign(int[] g, int[] s){
        Arrays.sort(g);
        Arrays.sort(s);

        int l = 0, m = 0;
        while(l < s.length && m < g.length){
            if (s[l] >= g[m]) m++;
            l++;
        }
        return m;
    }
}
