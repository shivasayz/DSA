package Programs;

public class isArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,3,5,9,10,15};
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int[] nums){

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums[i-1]){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
