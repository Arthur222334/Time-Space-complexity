package PRact;

public class DINO {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        int ans = Bino(array, 9);
        System.out.print(ans);
        ;
    }

    static int Bino(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        boolean isAsc = array[start] < array[end];
        while (end >= start) {
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
