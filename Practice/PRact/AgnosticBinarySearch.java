package PRact;

public class AgnosticBinarySearch {
    public static void main(String[] args) {
        int[] array = {-10, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ans = BIno(array, 7);
        System.out.println(ans);
    }
    static int BIno(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        boolean isAsc = array[start] < array[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}