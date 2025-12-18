package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {4,7,1,0};

        System.out.println(Brute(arr));
        System.out.println(Optimal(arr));
    }

    public static List<Integer> Brute(int[] arr){
        List<Integer> res = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            boolean isLarger = true;
            for(int j=i+1; j<arr.length; j++){
                if (arr[j] > arr[i]) {
                    isLarger = false;
                    break;
                }
            }

            if (isLarger) res.add(arr[i]);

        }
        return res;
    }

    public static List<Integer> Optimal(int[] arr){
        List<Integer> res = new ArrayList<>();
        int maxEle = Integer.MIN_VALUE;

        for (int i=arr.length-1; i>=0; i--){
            if (arr[i] > maxEle){
                maxEle = arr[i];
                res.add(maxEle);
            }
        }
        Collections.reverse(res);
        return  res;
    }
}
