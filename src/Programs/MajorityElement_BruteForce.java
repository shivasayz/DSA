package Programs;

public class MajorityElement_BruteForce {
    public static void main(String[] args) {
        int[] arr = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        int len = arr.length;

        int res = MajorityElement(arr,len);
        System.out.println(res);
    }

    public static int MajorityElement(int[] arr, int n){

        int count;
        for (int i = 0; i < n; i++) {
            count=0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }
            }

            if (count > n/2){
                return arr[i];
            }
        }
        return -1;
    }
}
