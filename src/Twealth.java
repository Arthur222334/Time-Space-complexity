public class Twealth {
    public static void main(String[] args) {
        int[][] array = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        for (int[] row : array) {
            for (int i = 0; i < array[0].length + 1 / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[array[0].length - i - 1];
                row[array[0].length - i - 1] = temp;
            }
        }
    }
}

