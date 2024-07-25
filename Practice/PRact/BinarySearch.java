package PRact;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {-10, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ans = binarySearch(array, 7);
        System.out.println(ans);
    }

    static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}