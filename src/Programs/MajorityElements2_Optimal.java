package Programs;

import java.util.ArrayList;
import java.util.List;

public class MajorityElements2_Optimal {
    public static void main(String[] args) {

        int[] arr = {11,33,33,11,33,11};
//        int[] arr = {1,2,3,4,5};
        int len = arr.length;

        List<Integer> res = MajorityEle(arr, len);
        System.out.println(res);
    }

    private static List<Integer> MajorityEle(int[] arr, int len) {

        int count1=0, count2=0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;

        for (int i = 0; i < len; i++) {
            if (count1 == 0 && arr[i] != ele2){
                ele1 = arr[i];
                count1 = 1;
            } else if (count2 == 0 && arr[i] != ele1){
                ele2 = arr[i];
                count2 = 1;
            } else if (arr[i] == ele1 ){
                count1++;
            } else if (arr[i] == ele2){
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        List<Integer> list = new ArrayList<>();
        count1 = 0; count2=0;

        for (int k = 0; k < len; k++) {
            if (arr[k] == ele1){
                count1++;
            }

            if (arr[k] == ele2){
                count2++;
            }
        }

        int min = (int)(len/3) + 1;

        if (count1 >= min)
            list.add(ele1);

        if (count2 >= min)
            list.add(ele2);

        return list;
    }
}
