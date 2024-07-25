package PRact;

import java.util.Scanner;

public class NEstedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.nextLine();

        switch (empId) {
            case 1:
                System.out.println("mango");
                System.out.println("enter the department :");
                switch (department) {
                    case "it":
                        System.out.println("he is a software developer");
                        break;
                    case "BSc":
                        System.out.println("he is a software developer");
                        break;
                    case "ED":
                        System.out.println("he is a software developer");
                        break;
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;

        }
    }
}
