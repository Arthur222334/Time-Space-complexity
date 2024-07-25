public class ColNoFixed {
    public static void main(String[] args) {
        int[][] arr =
                {
                        {1,2,3},
                        {2,5},
                        {8,9},
                };

        for (int[]array:arr){
            for (int value:array) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
