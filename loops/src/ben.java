public class ben {
    public static void main(String[] args) {
//        initialize: condition : change of count:
        int n = 20, c = 0;
        for (int i = 1; i >= n;) {
            if (n % 1 == 0) c++;
        }
        System.out.println(c == 2 ? "prime" : "non prime");
    }
}

