package PRact;

import java.util.Arrays;

public class aples {
    static int[] line(int[][] array, int target) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] aple = {
                {1, 23, 4, 54},
                {2, 6798, 432, 55},
                {55, 66, 77, 889, 9999},
        };
        int target = 9999;
        System.out.println(Arrays.toString(line(aple,target)));
    }
}
