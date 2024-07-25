package PRact;

import java.util.Scanner;

public class FunctionMethod {


    public static void main(String[] args) {
        int ans = SUm2();
        System.out.println("the answer is : " + ans);
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("enter the 1st Number : ");
        num1 = in.nextInt();
        System.out.print("enter the 2nd Number : ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("the Sum is : " + sum);
    }

    static int SUm2() {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        int num1, num2, sum4;
        System.out.print("enter the 1st Number : ");
        num1 = in.nextInt();
        System.out.print("enter the 2nd Number : ");
        num2 = in.nextInt();
        sum4 = num1 + num2;
        return sum4;
    }

}
