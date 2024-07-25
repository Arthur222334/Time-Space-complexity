public class Loop {
    public static void main(String[] args) {
        int n = 9;
        int m = 12;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (i == 1 ||i == n - 1 || j==1|| j == m - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
//rectangle
//        int i = 1;
//        while (i <= 4) {
//            System.out.print("*");
//            int j = 1;
//            while (j <= 5) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }