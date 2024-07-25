import java.util.Scanner;

public class Dev {
    public static void main(String[] args) {

        double amt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit:");
        double unit = sc.nextDouble();

        if (unit > 200) {
            amt = amt + (unit - 200) * 13;
            unit = 200;
        }
        if (unit > 100) {
            amt = amt + (unit - 100) * 13;
            unit = 100;
        }
        if (unit > 50) {
            amt = amt + (unit - 50) * 13;
            unit = 50;
        }
        amt = amt + unit * 4.2;
        System.out.println("Total amount: " + amt);
    }
}
