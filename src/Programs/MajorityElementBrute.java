package Programs;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementBrute {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,2,2,2};
        List<Integer> res = findMajority(arr);
        System.out.println(res);
    }

    public static List<Integer> findMajority(int[] arr) {
        int n = arr.length;
        List<Integer> res = new ArrayList<>();

        for (int k : arr) {
            if (res.isEmpty() || res.getLast() != k) {
                int count = 0;
                for (int i : arr) {
                    if (k == i) {
                        count++;
                    }
                }

                if (count > n / 3) {
                    res.add(k);
                }
            }
        }
    return res;
    }
}
