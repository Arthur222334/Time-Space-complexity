package PRact;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check Weather it is armstrong or not : ");
        int num = sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println(num + " its an armStrong Number");
        } else {
            System.out.println(num + "its not an ArmStrong number");
        }
    }

    public static boolean isArmstrong(int num) {
        int n = num, sum = 0, temp;
        int order = 0;
        while (n != 0) {
            order++;
            temp = n % 10;
            n /= 10;
            sum += temp * temp * temp;
        }
        return sum == num;
    }
}
