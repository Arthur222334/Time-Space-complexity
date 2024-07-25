package PRact;

public class Overloading {
    public static void main(String[] args) {
fun("apple is A Fruits");
fun(23);

    }



    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String a) {
        System.out.println(a);
    }
}
