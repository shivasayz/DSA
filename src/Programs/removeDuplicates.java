package Programs;

import Patterns.fullPyramid;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3};
        remove(arr);
    }

    public static void remove(int[] num){
        int i = 0;
        for (int j = 1; j < num.length; j++) {
            if(num[j] != num[i]){
                num[i+1] = num[j];
                i++;
            }
        }
        System.out.println(i+1);
        System.out.println(fullPyramid.printFullPyramid(4));
        System.out.println(BestTimeToBuyAndSellStocks.findBestTime(new int[] {7,1,5,3,6,4}));
    }
}
