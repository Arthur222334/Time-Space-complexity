package PRact;

import java.util.Arrays;

public class FunctionObject {
    public static void main(String[] args) {
        int []num ={3,4,5,13};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));

    }
    static  void change(int []arr){
        arr[0]=99;
    }
}
