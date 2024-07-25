package PRact;

import java.util.Arrays;

public class SearchIn2DArray {

    static int[] search(int[][] array, int target) {

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1};
    }


    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {5, 6, 7, 8},
                {77, 66, 55, 44, 33},
                {1000, 100, 90, 84, 43}
        };
        int target = 100;
        int []ans =search(arr,target);
        System.out.println((Arrays.toString(ans)));
    }
}
