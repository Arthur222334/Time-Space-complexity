package PRact;

import java.util.ArrayList;
import java.util.Scanner;

public class lsirrr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(12);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
