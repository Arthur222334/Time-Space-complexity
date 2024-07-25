public class Main {
    public static void main(String[] args) {
        double p = 1000, t = 360, r = 0.02;
        double s = (p + t + r) / 2.0;
        double a = Math.sqrt(s * (s - p) * (s - t) * (s - r));
        System.out.println(a);
    }
}
