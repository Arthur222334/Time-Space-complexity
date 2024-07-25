package PRact;

public class MaxValju {
    static int max(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : array) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }


    public static void main(String[] args) {

        int arr[][] = {
                {1, 2, 3, 4, 5, 67},
                {8, 9, 10, 10, 22, 69},
                {122, 112, 3221, 114, 512, 60000000, 700000, 800, 900, 1000}
        };
        int ans = max(arr);
        System.out.println(ans);
    }
}


