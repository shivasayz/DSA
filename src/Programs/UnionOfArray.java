package Programs;

import java.util.ArrayList;

public class UnionOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6,7};

        ArrayList<Integer> res = union(arr1, arr2);
        System.out.println(res);
    }

    static ArrayList<Integer> union(int[] arr1, int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        int i=0, j=0;
        int n1 = arr1.length;
        int n2 = arr2.length;

        while (i<n1 && j<n2){
            if (arr1[i] <= arr2[j]){
                if (list.isEmpty() || list.getLast() != arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
            } else {
                if (list.isEmpty() || list.getLast() != arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
            }
        }

        while (i<n1){
            if (list.isEmpty() || list.getLast() != arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }

        while (j<n2){
            if (list.isEmpty() || list.getLast() != arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }

        return list;
    }
}
