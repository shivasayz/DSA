package BinarySearch;

public class BooksAllocationBrute {
    public static void main(String[] args) {
        int[] books = {12, 34, 67, 90};
        int noOfStudents = 2;

        System.out.println(findAllocation(books, noOfStudents));
    }

    public static int findAllocation(int[] arr, int m) {
        int max = maxOf(arr);
        int sum = sumOf(arr);

        for (int i = max; i <= sum; i++) {
            if (isAllocated(arr, i, m)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isAllocated(int[] arr, int maxPages, int m) {
        int students = 1;
        int pages = 0;

        for (int book : arr) {
            if (pages + book <= maxPages) {
                pages += book;
            } else {
                students++;
                pages = book;
            }
        }

        return students <= m;
    }

    public static int maxOf(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int ele : arr) {
            max = Math.max(max, ele);
        }
        return max;
    }

    public static int sumOf(int[] arr) {
        int sum = 0;
        for (int ele : arr) {
            sum += ele;
        }
        return sum;
    }
}
