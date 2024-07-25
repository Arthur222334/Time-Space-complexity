import java.util.Scanner;

public class jex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age :");
        int button = sc.nextInt();
//        if (button == 1) {
//            System.out.println("hello");
//        } else if (button == 2) {
//            System.out.println("namaste");
//        } else if (button == 3) {
//            System.out.println("bonjour senorita");
//        } else {
//            System.out.println("invalid");
//        }
        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("ola");
                break;
            case 3:
                System.out.println("gola");
                break;
            case 4:
                System.out.println("fola");
                break;
            case 5:
                System.out.println("jhola");
                break;
            default:
                System.out.println("invalid button");
        }
    }
}
