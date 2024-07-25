package PRact;

import java.util.Scanner;

public class CaseSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Fruits = in.next().toLowerCase();
        switch (Fruits) {
            case "apple" -> System.out.println("Its a king of fruits");
            case "mango" -> System.out.println("its a Sweet Flavor");
            case "banana" -> System.out.println("its a long Fruits");
            case "orange" -> System.out.println("its a long Fruits");
            case "grapes" -> System.out.println("its a long Fruits");
            case "berry" -> System.out.println("its a long Fruits");
            case "plum" -> System.out.println("its a long Fruits");
            case "vat" -> System.out.println("its a long Fruits");
            default -> System.out.println("the fruit isnt in the store Plz contact another shop");
        }
    }
}
