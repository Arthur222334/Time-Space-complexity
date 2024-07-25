public class ThirdExample {
    public static void main(String[] args) {
        int n = 101010001;
        int i = 3;
        System.out.println(IthNumberFinder(n, i));
    }

    static int IthNumberFinder(int n, int i) {
        while (n > 0) {
            return (n << (i - 1) & 1);
        }
        return -1;
    }
}
