package Programs;

import java.util.Arrays;
import java.util.SortedMap;

public class zerosToCorner {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,3,4,5};
        zerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void zerosToEnd(int[] nums){
        int i = 0;

        for(int num: nums){
            if(num != 0){
                nums[i++] = num;
            }
        }

        while(i<nums.length){
            nums[i++] = 0;
        }
    }
}