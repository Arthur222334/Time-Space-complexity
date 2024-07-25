public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 4) {
            System.out.print("1");
            int j = 1;
            while (j <= 5) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
