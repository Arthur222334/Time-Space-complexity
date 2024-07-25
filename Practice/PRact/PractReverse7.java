package PRact;

public class PractReverse7 {
    public static void main(String[] args) {
        int n = 123456789;
        int ReverseValue = 0;

        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            ReverseValue = ReverseValue * 10 + rem;
        }
        System.out.println(ReverseValue);
    }
}
