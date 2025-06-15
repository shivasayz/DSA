package Programs;
import java.util.Arrays;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        int[] res = findSmaller(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] findSmaller(int[] arr){
        int[] res = new int[arr.length];
        int j=0;

        for (int k : arr) {
            int count = 0;
            for (int i : arr) {
                if (i < k) {
                    count++;
                }
            }
            res[j++] = count;
        }
        return res;
    }
}
