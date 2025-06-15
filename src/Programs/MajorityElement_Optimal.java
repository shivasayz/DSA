package Programs;

public class MajorityElement_Optimal {
    public static void main(String[] args) {
        int[] arr = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        int len = arr.length;

        int res = MajorityElement1(arr, len);
        System.out.println(res);
    }

    public static int MajorityElement1(int[] arr, int n){

        int count=0, candidate = -1;

        for (int i = 0; i < n; i++) {
            if (count == 0){
                candidate = arr[i];
                count++;
            } else {
                if (candidate == arr[i]){
                    count++;
                } else {
                    count--;
                }
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == candidate){
                count++;
            }

            if (count > n/2){
                return candidate;
            }
        }
        return -1;
    }
}
