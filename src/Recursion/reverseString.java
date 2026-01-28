package Recursion;

import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseAString(s);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseAString(char[] s){
        reverseAStringHelper(s, 0, s.length-1);
    }

    public static void reverseAStringHelper(char[] s, int start, int end){
        // base case
        if (start >= end) return;

        // recursive case
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        // recursive call
        reverseAStringHelper(s, start+1, end - 1);
    }
}
