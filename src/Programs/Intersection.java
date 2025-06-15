package Programs;

import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};

        ArrayList<Integer> res = inter(arr1, arr2);
        System.out.println(res);
    }

    static ArrayList<Integer> inter(int[] arr1, int[] arr2){
        int i=0, j=0;
        ArrayList<Integer> list = new ArrayList<>();

        int n1 = arr1.length;
        int n2 = arr2.length;

        while(i < n1 && j < n2){

            if (arr1[i] < arr2[j]){
                i++;
            } else if (arr2[j] < arr1[i]){
                j++;
            } else {
                list.add(arr1[i]);
                i++; j++;
            }
        }
        return list;
    }
}
