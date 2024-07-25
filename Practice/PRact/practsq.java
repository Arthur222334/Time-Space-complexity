package PRact;

import java.util.Arrays;

public class practsq {
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reveralArray(int[] arr, int start, int end) {
        start = 0;
        end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        reveralArray(array, 0, 0);
        System.out.println(Arrays.toString(array));
    }
}
