package PRact;

import javax.sound.midi.SoundbankResource;
import java.util.Arrays;

public class linedress {
    public static void main(String[] args) {
        int[][] bad = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int target = 6;
        System.out.println(Arrays.toString(apple(bad,target)));
    }

    static int[] apple(int[][] array, int target) {
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
