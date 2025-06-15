package Programs;
import java.util.Arrays;

public class SmallerThanCurrentNumber_Opt_1365 {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
//        int[] res = findSmaller(arr);
        findSmaller(arr);
//        System.out.println(Arrays.toString(res));
    }

    public static void findSmaller(int[] arr){
        int[] count = new int[101];
        for(int ele: arr){
            count[ele]++;
        }
        System.out.println(Arrays.toString(count));

        int[] lessThan = new int[101];
        for (int i = 1; i < 101; i++) {
            lessThan[i] = count[i-1] + lessThan[i-1];
        }
        System.out.println(Arrays.toString(lessThan));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = lessThan[arr[i]];
        }
        System.out.println(Arrays.toString(arr));
    }
}
