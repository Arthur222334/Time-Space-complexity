public class While {
    public static void main(String[] args) {
        int n = 5454545, sum = 0;
        while (n != 0){
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
