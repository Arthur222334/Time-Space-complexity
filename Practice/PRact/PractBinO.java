package PRact;

public class PractBinO {
    public static int ago(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            boolean isAsc = array[end] > array[start];
            if (target == array[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < array[mid]) {
                    end = mid - 1;
                }else {
                    start= mid+1;
                }
            }else {
                if (target > array[mid]) {
                    end = mid - 1;
                }else {
                    start= mid+1;
                }
            }
        }
        return -1;
    }
}
