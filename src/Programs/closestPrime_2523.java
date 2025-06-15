package Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class closestPrime_2523 {
    public static void main(String[] args) {
        int[] res = closePrime(10, 19);
        System.out.println(Arrays.toString(res));
    }

    public static int[] closePrime(int n1, int n2){
        int[] res = new int[2];
        int diff = Integer.MAX_VALUE;

        res[0] = -1;
        res[1] = -1;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = n1; i <=n2 ; i++) {
            if (isPrime(i)){
                list.add(i);
            }
        }

        if (list.size() < 2){
            return new int[] {-1, -1};
        }

        for (int i = 1; i < list.size(); i++) {
            int nbr1 = list.get(i-1);
            int nbr2 = list.get(i);
            int gap = nbr2 - nbr1;


            if (gap < diff){
                diff = gap;
                res[0] = nbr1;
                res[1] = nbr2;
            }
        }

        return res;
    }

    public static boolean isPrime(int n){

        if (n <= 1){
            return false;
        }

        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }
}
