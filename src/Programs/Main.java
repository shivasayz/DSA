package Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        int[] arr = {-2,-2,-2,-1,-1,-1,0,0,0,2,2,2,2};
        Set<List<Integer>> res = findTriplets(arr);
        
        System.out.println(res);
    }
    
    public static Set<List<Integer>>  findTriplets(int[] arr){
        Set<List<Integer>> set = new HashSet<>();
        
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    int sum = arr[i] + arr[j] + arr[k];
                    
                    if (sum == 0){
                        List<Integer> list = Arrays.asList(arr[i], arr[j], arr[k]);
                        list.sort(null);
                        set.add(list);
                    } 
                }
            }
        }
        return set;
    }
}