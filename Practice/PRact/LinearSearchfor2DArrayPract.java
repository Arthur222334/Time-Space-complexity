package PRact;

import java.util.Arrays;

public class LinearSearchfor2DArrayPract {


    public static void main(String[] args) {
        int[][] sapp = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 14, 15},
                {0, 9, 8, 5, 4, 2, 5, 72, 72, 65522},
        };
        int target = 65522;
        int[]ans = LInero(sapp, target);
        System.out.println(Arrays.toString(ans));
    }


    static int[] LInero(int[][] array, int target) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
