package BinarySearch;

public class KthMissingNumberBrute2 {
    public static void main(String[] args) {
        int[] arr = {4,7,9,10};
        int k = 4;

        System.out.println(findKthNumber(arr, k));
    }

    public static int findKthNumber(int[] arr, int k) {
        int missingCount = 0;
        int current = 1;
        int index = 0;

        while (true) {
            if (index < arr.length && arr[index] == current) {
                // current number exists in the array
                index++;
            } else {
                // current number is missing
                missingCount++;
                if (missingCount == k) {
                    return current;
                }
            }
            current++;
        }
    }
}

//        | current | arr[index] | Match?  | Action             | missingCount   |
//        | ------- | ---------- | ------  | ------------------ | -------------- |
//        | 1       | 2          | ❌      | missing → count +1 | 1              |
//        | 2       | 2          | ✅      | index++            | 1              |
//        | 3       | 3          | ✅      | index++            | 1              |
//        | 4       | 4          | ✅      | index++            | 1              |
//        | 5       | 7          | ❌      | missing → count +1 | 2              |
//        | 6       | 7          | ❌      | missing → count +1 | 3              |
//        | 7       | 7          | ✅      | index++            | 3              |
//        | 8       | 11         | ❌      | missing → count +1 | 4              |
//        | 9       | 11         | ❌      | missing → count +1 | 5 →  return    |



