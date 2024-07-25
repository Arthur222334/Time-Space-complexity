package PRact;

import java.util.Arrays;

public class CartSwap {
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    static void revo(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] aplle = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        revo(aplle);
        String Str = Arrays.toString(aplle);
        System.out.println(Str);
    }
}
