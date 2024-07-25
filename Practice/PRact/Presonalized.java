package PRact;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class Presonalized {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your name : ");
        String NAME  = in.nextLine();
        String Greeting = Pgreet(NAME);
        System.out.println("Namaste & hello " + Greeting);
    }

    private static String Pgreet(String name) {

        String message = name;
        return message;
    }
}
