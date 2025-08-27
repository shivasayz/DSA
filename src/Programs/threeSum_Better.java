package Programs;

import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
import java.util.Set;

public class threeSum_Better {
    public static void main(String[] args){
        int[] arr = {-2,-2,-2,-1,-1,-1,0,0,0,2,2,2,2};
        Set<List<Integer>> res = findTriplets(arr);
        System.out.println(res);
    }

    public static Set<List<Integer>> findTriplets(int[] arr){
        Set<List<Integer>> res = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            Set <Integer> hashset = new HashSet<>();
            for(int j=i+1; j<arr.length; j++){
                int third = -(arr[i] + arr[j]);
                if (hashset.contains(third)){
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    temp.sort(null);
                    res.add(temp);
                }
                hashset.add(arr[j]);
            }
        }
        return res;
    }
}
