public class EuclideanAlgo {
    /*HCF*/
    public static void main(String[] args) {
        System.out.println(HCF(3, 7));
        System.out.println(LCM(3,19));
    }

    static int HCF(int a, int b) {
        if (a == 0) {
            return b;
        }
        return HCF(b % a, a);
    }

    static int LCM(int a, int b) {
        return a * b / HCF(a, b);
    }

}
