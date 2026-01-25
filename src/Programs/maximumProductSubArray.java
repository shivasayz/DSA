package Programs;

public class maximumProductSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        System.out.println(findMaxSubArray(arr));
    }

    public static int findMaxSubArray(int[] nums){
        int max = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;

        for(int i=0; i<nums.length; i++){
            prefix *= nums[i];
            suffix *= nums[nums.length - 1 - i];

            max = Math.max(max, Math.max(prefix, suffix));

            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;
        }
        return max;
    }
}
