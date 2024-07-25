public class Eleventh {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        int ans = startXor(b)^startXor(a-1);
        System.out.println(ans);
    }

    static int startXor(int a) {
        if (a % 4 == 0) {
            return a;
        }
        if (a % 4 == 1) {
            return 1;
        }
        if (a % 4 == 2) {
            return a + 1;
        }
        return 0;
    }
}
