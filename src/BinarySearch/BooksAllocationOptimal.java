package BinarySearch;

public class BooksAllocationOptimal {
    public static void main(String[] args) {
        int[] books = {12, 34, 67, 90};
        int noOfStudents = 2;

        System.out.println(findAllocation(books, noOfStudents));
    }

    public static int findAllocation(int[] arr, int students){
        int start = getMax(arr);
        int end = getSum(arr);
        int result = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (canAllocate(arr, mid, students)){
                result = mid;      // valid allocation found
                end = mid - 1;     // try for a better (smaller) max
            } else {
                start = mid + 1;   // need to allow more pages per student
            }
        }

        return result;
    }

    public static boolean canAllocate(int[] arr, int maxPages, int students){
        int requiredStudents = 1;
        int currentPages = 0;

        for (int pages : arr){
            if (pages > maxPages) return false; // single book > limit

            if (currentPages + pages <= maxPages){
                currentPages += pages;
            } else {
                requiredStudents++;
                currentPages = pages;
            }
        }

        return requiredStudents <= students;
    }

    public static int getMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int num : arr){
            max = Math.max(max, num);
        }
        return max;
    }

    public static int getSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
}
