package PRact;

import java.awt.im.InputMethodRequests;

public class Scope {
static  int a = 34;
    public static void main(String[] args) {
        String apple = "it is a fruit";
        System.out.println(apple);
        {
            apple = "itts a brand";
            System.out.println(apple);

            System.out.println(a);
        }
    }
}








/*
    int apple = random(1, 4);
        System.out.println("The Sum is : " + apple);
}

static int random(int a, int b) {
    int sum = a + b;
    return sum;
}*/