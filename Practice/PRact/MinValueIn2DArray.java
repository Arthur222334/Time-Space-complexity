package PRact;

public class MinValueIn2DArray {
    static int min(int[][] array) {
        int min = Integer.MAX_VALUE;
        for (int[] ints : array) {
            for (int apple : ints) {
                if (apple < min) {
                    min = apple;
                }
            }
        }
        return min;
    }


    public static void main(String[] args) {

        int arr[][] = {
                {1, 2, 3, 4, 5, 67},
                {8, 9, 10, 10, 22, 69},
                {122, 112, 3221, 114, 512, 60000000, 700000, 800, 900, 1000}
        };
        int ans = min(arr);
        System.out.println(ans);
    }
}
