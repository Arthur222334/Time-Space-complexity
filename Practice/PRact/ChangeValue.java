package PRact;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create an array
        int[] apple = {1, 3, 2, 45, 6};
        change(apple);
        System.out.println(Arrays.toString(apple));
    }

    static void change(int[] numbes) {
        numbes[0] = 99;
    }
}
