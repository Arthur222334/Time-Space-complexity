package PRact;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,3,4,4,4,2,2,33,2);
MultiArgs(1,2,"apple is a ball","apple is also a Fruits");
    }




    static  void MultiArgs(int a,int b,String ...v){
        System.out.println(Arrays.toString(v));


    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
}
