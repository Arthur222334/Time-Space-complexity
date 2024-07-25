package PRact;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[]= new String[4];
        System.out.println("enter the number of Strings : ");
        for (int i = 0; i <str.length ; i++) {
            str[i]=sc.nextLine();
        }
        System.out.println(Arrays.toString(str));
    }
}
