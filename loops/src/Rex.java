import java.util.Scanner;

public class Rex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1:");
        double num1 = sc.nextDouble();

        System.out.println("enter num2:");
        double num2 = sc.nextDouble();

        System.out.println("Enter the operator(+,-,/,*)");
        char operator = sc.next().charAt(0);
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2  != 0 && num1  != 0){
                    result = num1 / num2;
                } else {
                    System.out.println("cannot be duivided");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("Result: " + result);
    }
}
